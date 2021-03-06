package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Audio {
    private String file_id;
    private String file_unique_id;
    private Integer duration;
    private String performer;
    private String title;
    private String mime_type;
    private Integer file_size;
    private PhotoSize thumb;
}
