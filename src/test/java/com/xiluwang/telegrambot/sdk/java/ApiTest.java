package com.xiluwang.telegrambot.sdk.java;

import com.xiluwang.telegrambot.sdk.api.BotApi;
import com.xiluwang.telegrambot.sdk.model.types.User;
import com.xiluwang.telegrambot.sdk.utility.ResourceLoader;
import com.xiluwang.telegrambot.sdk.utility.TestUtility;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

@Ignore
public class ApiTest {

    @Test
    public void callGetMe_thenLoadToken_returnBotInfo() throws IOException {
        String token = ResourceLoader.getToken();
        String baseUrl = ResourceLoader.getBaseUrl();
        String url = baseUrl + token + "/getMe";
        User user = (User) BotApi.get(url, User.class);
        TestUtility.prettyPrintObject(user);
    }

}
