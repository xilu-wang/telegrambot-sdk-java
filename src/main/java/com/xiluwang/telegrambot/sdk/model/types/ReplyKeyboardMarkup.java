package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplyKeyboardMarkup {
    private KeyboardButton[] keyboard;
    private Boolean resize_keyboard;
    private Boolean one_time_keyboard;
    private Boolean selective;
}
