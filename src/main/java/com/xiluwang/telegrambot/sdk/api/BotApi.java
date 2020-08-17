package com.xiluwang.telegrambot.sdk.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiluwang.telegrambot.sdk.utility.RequestContentType;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class BotApi {

    public static Object post(String url, String body, Class responseClass) throws IOException {
        HttpUriRequest request;
        StringEntity entity = new StringEntity(body, StandardCharsets.UTF_8);
        entity.setContentType(RequestContentType.JSON.getValue());
        request = RequestBuilder.post()
                .setUri(url)
                .setEntity(entity)
                .build();
        return call(request, responseClass);
    }

    public static Object get(String url, Class responseClass) throws IOException {
        HttpUriRequest request;
        request = RequestBuilder.get()
                .setUri(url)
                .build();
        return call(request, responseClass);
    }

    public static Object getWithBody(String url, String body, Class responseClass) throws IOException {
        HttpUriRequest request;
        StringEntity entity = new StringEntity(body, StandardCharsets.UTF_8);
        entity.setContentType(RequestContentType.JSON.getValue());
        request = RequestBuilder.get()
                .setUri(url)
                .setEntity(entity)
                .build();
        return call(request, responseClass);
    }

    public static Object postFile(String url, Map<String, String> params,
                                   String fileKey, String localFilePath,
                                   Class responseClass)
            throws IOException {
        File file = new File(localFilePath);
        MultipartEntityBuilder builder = MultipartEntityBuilder.create()
                .addBinaryBody(fileKey,
                        new FileInputStream(file),
                        RequestContentType.BINARY_SIZED.getType(),
                        file.getName());
        params.forEach(builder::addTextBody);
        HttpEntity entity = builder.build();
        HttpUriRequest request;
        request = RequestBuilder.get()
                .setUri(url)
                .setEntity(entity)
                .build();
        return call(request, responseClass);
    }

    // TODO Add return type and customized RuntimeException for failed response
    private static Object call(HttpUriRequest request, Class clazz) throws IOException {
        Map<String, Object> resultMap = null;
        ObjectMapper mapper = new ObjectMapper();
        try (CloseableHttpResponse response = BotApiClient.getCloseableHttpClient().execute(request)) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream inputStream = entity.getContent();
                resultMap = mapper.readValue(inputStream, Map.class);
                inputStream.close();
            }
        }
        if (resultMap != null && (Boolean) resultMap.get("ok")) {
            String result = mapper.writeValueAsString(resultMap.get("result"));
            return mapper.readValue(result, clazz);
        } else {
            throw new RuntimeException("Invalid response from API call.");
        }
    }

}
