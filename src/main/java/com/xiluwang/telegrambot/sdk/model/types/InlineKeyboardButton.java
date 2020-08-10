package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xiluwang.telegrambot.sdk.model.games.CallbackGame;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InlineKeyboardButton {
    private String text;
    private String url;
    private LoginUrl login_url;
    private String callback_data;
    private String switch_inline_query;
    private String switch_inline_query_current_chat;
    private CallbackGame callback_game;
    private Boolean pay;
}
