package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Chat {
    private Integer id;
    private String type;
    private String title;
    private String username;
    private String first_name;
    private String last_name;
    private ChatPhoto photo;
    private String description;
    private String invite_link;
    private Message pinned_message;
    private ChatPermissions permissions;
    private Integer slow_mode_delay;
    private String sticker_set_name;
    private Boolean can_set_sticker_set;
    private Boolean all_members_are_administrators;
}
