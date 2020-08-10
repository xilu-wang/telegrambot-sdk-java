package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private Integer id;
    private Boolean is_bot;
    private String first_name;
    private String last_name;
    private String username;
    private String language_code;
    private Boolean can_join_groups;
    private Boolean can_read_all_group_messages;
    private Boolean supports_inline_queries;
}
