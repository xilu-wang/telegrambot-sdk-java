package com.xiluwang.telegrambot.sdk.utility;

import org.apache.http.entity.ContentType;

public enum RequestContentType {
    JSON ("application/json", ContentType.APPLICATION_JSON),
    BINARY ("application/x-www-form-urlencoded", ContentType.APPLICATION_FORM_URLENCODED),
    BINARY_SIZED ("multipart/form-data", ContentType.MULTIPART_FORM_DATA);

    private String value;
    private ContentType type;

    RequestContentType(String value, ContentType type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return this.value;
    }

    public ContentType getType() {
        return this.type;
    }

}
