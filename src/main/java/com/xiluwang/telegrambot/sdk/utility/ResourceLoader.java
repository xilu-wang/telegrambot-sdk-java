package com.xiluwang.telegrambot.sdk.utility;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Slf4j
public class ResourceLoader {

    private static Properties PROPERTIES;

    public static String getToken() {
        if (PROPERTIES == null)
            loadProp();
        return PROPERTIES.getProperty("token");
    }

    public static String getBaseUrl() {
        if (PROPERTIES == null)
            loadProp();
        return PROPERTIES.getProperty("baseUrl");
    }

    private static void loadProp() {
        PROPERTIES = new Properties();
        String fileName = "application.properties";
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        try {
            PROPERTIES.load(new FileInputStream(file));
        } catch (IOException e) {
            log.error("Error reading base url and token in application.properties. Please make sure they've been defined.");
            throw new RuntimeException(e);
        }
    }
}
