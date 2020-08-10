package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginUrl {
    private String url;
    private String forward_text;
    private String bot_username;
    private Boolean request_write_access;
}
