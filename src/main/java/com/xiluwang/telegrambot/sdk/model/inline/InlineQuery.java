package com.xiluwang.telegrambot.sdk.model.inline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xiluwang.telegrambot.sdk.model.types.Location;
import com.xiluwang.telegrambot.sdk.model.types.User;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InlineQuery {
    private String id;
    private User from;
    private Location location;
    private String query;
    private String offset;
}
