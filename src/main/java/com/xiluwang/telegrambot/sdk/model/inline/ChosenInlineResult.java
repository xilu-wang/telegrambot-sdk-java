package com.xiluwang.telegrambot.sdk.model.inline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xiluwang.telegrambot.sdk.model.types.Location;
import com.xiluwang.telegrambot.sdk.model.types.User;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChosenInlineResult {
    private String result_id;
    private User from;
    private Location location;
    private String inline_message_id;
    private String query;
}
