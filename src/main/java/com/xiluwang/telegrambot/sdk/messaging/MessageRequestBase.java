package com.xiluwang.telegrambot.sdk.messaging;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageRequestBase {
    private final String chat_id;
    private final Boolean disable_web_page_preview;
    private final Boolean disable_notification;
    private final Integer reply_to_message_id;
    // TODO: reply_markup
}
