package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageEntity {
    private String type;
    private Integer offset;
    private Integer length;
    private String url;
    private User user;
    private String language;
}
