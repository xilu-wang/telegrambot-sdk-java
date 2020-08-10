package com.xiluwang.telegrambot.sdk.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class TestUtility {

    private final static ObjectMapper PRETTY_MAPPER = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT);
    private final static ObjectMapper MAPPER = new ObjectMapper();

    public static String objectToJsonString(Object object)
            throws JsonProcessingException {
        return MAPPER.writeValueAsString(object);
    }

    public static void prettyPrintJsonString(String json)
            throws JsonProcessingException {
        Object jsonObject = PRETTY_MAPPER.readValue(json, Object.class);
        System.out.println(PRETTY_MAPPER.writeValueAsString(jsonObject));
    }

    public static void prettyPrintObject(Object object)
            throws JsonProcessingException {
        System.out.println(PRETTY_MAPPER.writeValueAsString(object));
    }
}
