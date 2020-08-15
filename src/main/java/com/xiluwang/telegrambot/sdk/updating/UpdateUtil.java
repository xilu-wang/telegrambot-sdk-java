package com.xiluwang.telegrambot.sdk.updating;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiluwang.telegrambot.sdk.api.BotApi;
import com.xiluwang.telegrambot.sdk.model.updates.Update;
import com.xiluwang.telegrambot.sdk.utility.Endpoint;
import com.xiluwang.telegrambot.sdk.utility.ResourceLoader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UpdateUtil {

    private static final String HOST_URL = ResourceLoader.getBaseUrl() + ResourceLoader.getToken();

    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * This method will fetch all updates from the last offset, it won't reset the offset.
     * @return An array of Update
     * @throws IOException if the response cannot parse to an array of Update
     */
    public static Update[] getUpdates() throws IOException {
        String url = HOST_URL + Endpoint.GET_UPDATE.getValue();
        return (Update[]) BotApi.get(url, Update[].class);
    }

    /**
     * This method will fetch all updates from the given offset (include the offset)
     * and reset the offset for future updates.
     * @param offset The update Id you want to start with
     * @return An array of Update
     * @throws IOException if the response cannot parse to an array of Update
     */
    public static Update[] getUpdatesWithOffset(Integer offset) throws IOException {
        String url = HOST_URL + Endpoint.GET_UPDATE.getValue();
        Map<String, Integer> request = new HashMap<>();
        request.put("offset", offset);
        String body = MAPPER.writeValueAsString(request);
        return (Update[]) BotApi.getWithBody(url, body, Update[].class);
    }

}
