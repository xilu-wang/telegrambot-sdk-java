package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatMember {
    private User user;
    private String status;
    private String custom_title;
    private Integer until_date;
    private Boolean can_be_edited;
    private Boolean can_post_messages;
    private Boolean can_edit_messages;
    private Boolean can_delete_messages;
    private Boolean can_restrict_members;
    private Boolean can_promote_members;
    private Boolean can_change_info;
    private Boolean can_invite_users;
    private Boolean can_pin_messages;
    private Boolean is_member;
    private Boolean can_send_messages;
    private Boolean can_send_media_messages;
    private Boolean can_send_polls;
    private Boolean can_send_other_messages;
    private Boolean can_add_web_page_previews;
}
