package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyboardButton {
    private String text;
    private Boolean request_contact;
    private Boolean request_location;
    private KeyboardButtonPollType request_poll;
}
