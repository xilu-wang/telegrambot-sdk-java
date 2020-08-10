package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InputMediaVideo extends InputMedia {
    private String type;
    private String media;
    private String thumb;
    private String caption;
    private String parse_mode;
    private Integer width;
    private Integer height;
    private Integer duration;
    private Boolean supports_streaming;
}
