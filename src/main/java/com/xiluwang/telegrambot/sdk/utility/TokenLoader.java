package com.xiluwang.telegrambot.sdk.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TokenLoader {

    public static String getToken() throws IOException {

        String fileName = "application.properties";
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        Properties prop = new Properties();
        prop.load(new FileInputStream(file));

        return prop.getProperty("token");
    }
}
