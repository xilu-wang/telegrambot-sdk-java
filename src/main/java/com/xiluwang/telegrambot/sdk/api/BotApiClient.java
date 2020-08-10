package com.xiluwang.telegrambot.sdk.api;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

public class BotApiClient {

    private static PoolingHttpClientConnectionManager poolingConnManager;

    private BotApiClient() {
    }

    public static CloseableHttpClient getCloseableHttpClient() {
        if (poolingConnManager == null) {
            poolingConnManager = new PoolingHttpClientConnectionManager();
            poolingConnManager.setDefaultMaxPerRoute(5);
            poolingConnManager.setMaxTotal(5);
        }
        return HttpClients.custom()
                .setConnectionManager(poolingConnManager)
                .build();
    }
}
