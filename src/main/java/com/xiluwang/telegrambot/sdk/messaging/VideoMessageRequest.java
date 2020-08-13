package com.xiluwang.telegrambot.sdk.messaging;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VideoMessageRequest extends MessageRequestBase {
    private final String video;
    private final Integer duration;
    private final Integer width;
    private final Integer height;
    private final String thumb;
    private final String caption;
    private final Boolean supports_streaming;

    @Builder
    public VideoMessageRequest(String chatId,
                               Boolean disableWebpagePreview,
                               Boolean disableNotification,
                               Integer replyToMessageId,
                               String video,
                               Integer duration,
                               Integer width,
                               Integer height,
                               String thumb,
                               String caption,
                               Boolean supportsStreaming) {
        super(chatId, disableWebpagePreview, disableNotification, replyToMessageId);
        this.video = video;
        this.duration = duration;
        this.width = width;
        this.height = height;
        this.thumb = thumb;
        this.caption = caption;
        supports_streaming = supportsStreaming;
    }
}
