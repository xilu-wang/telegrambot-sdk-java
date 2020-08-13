package com.xiluwang.telegrambot.sdk.updating;

import com.xiluwang.telegrambot.sdk.api.BotApi;
import com.xiluwang.telegrambot.sdk.model.updates.Update;
import com.xiluwang.telegrambot.sdk.utility.Endpoint;
import com.xiluwang.telegrambot.sdk.utility.ResourceLoader;

import java.io.IOException;

public class UpdateUtil {

    private static final String HOST_URL = ResourceLoader.getBaseUrl() + ResourceLoader.getToken();

    public static Update[] getUpdates() throws IOException {
        String url = HOST_URL + Endpoint.GET_UPDATE.getValue();
        return (Update[]) BotApi.get(url, Update[].class);
    }

}
