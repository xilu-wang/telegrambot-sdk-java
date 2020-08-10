package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatPermissions {
    private Boolean can_send_messages;
    private Boolean can_send_media_messages;
    private Boolean can_send_polls;
    private Boolean can_send_other_messages;
    private Boolean can_add_web_page_previews;
    private Boolean can_change_info;
    private Boolean can_invite_user;
    private Boolean can_pin_messages;
}
