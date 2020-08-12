package com.xiluwang.telegrambot.sdk.messaging;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PhotoMessageRequest extends MessageRequestBase {
    private final String photo;

    @Builder
    public PhotoMessageRequest(String chatId,
                               Boolean disableWebpagePreview,
                               Boolean disableNotification,
                               Integer replyToMessageId,
                               String photo) {
        super(chatId, disableWebpagePreview, disableNotification, replyToMessageId);
        this.photo = photo;
    }
}
