package com.xiluwang.telegrambot.sdk.messaging;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextMessageRequest extends MessageRequestBase {
    private final String text;

    @Builder
    public TextMessageRequest(String chatId,
                              Boolean disableWebpagePreview,
                              Boolean disableNotification,
                              Integer replyToMessageId,
                              String text) {
        super(chatId, disableWebpagePreview, disableNotification, replyToMessageId);
        this.text = text;
    }
}
