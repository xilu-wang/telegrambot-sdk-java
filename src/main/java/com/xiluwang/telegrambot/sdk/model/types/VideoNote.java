package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VideoNote {
    private String file_id;
    private String file_unique_id;
    private Integer length;
    private Integer duration;
    private PhotoSize thumb;
    private Integer file_size;
}
