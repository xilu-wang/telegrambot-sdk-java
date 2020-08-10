package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InputMediaAudio extends InputMedia {
    private String type;
    private String media;
    private String thumb;
    private String caption;
    private String parse_mode;
    private Integer duration;
    private String performer;
    private String title;
}
