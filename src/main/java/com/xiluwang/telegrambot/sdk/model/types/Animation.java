package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Animation {
    private String file_id;
    private String file_unique_id;
    private Integer width;
    private Integer height;
    private Integer duration;
    private PhotoSize thumb;
    private String file_name;
    private String mime_type;
    private Integer file_size;
}
