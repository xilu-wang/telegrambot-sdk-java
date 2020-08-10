package com.xiluwang.telegrambot.sdk.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class BotApi {

    public static Object call(String url, boolean isPost, String contentType, String json, Class clazz) throws IOException {
        HttpUriRequest request;
        Map<String, Object> resultMap = null;
        if (isPost) {
            request = RequestBuilder.post()
                    .setUri(url)
                    .setHeader(HttpHeaders.CONTENT_TYPE, contentType)
                    .setEntity(new StringEntity(json))
                    .build();
        } else {
            request = RequestBuilder.get()
                    .setUri(url)
                    .build();
        }

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
