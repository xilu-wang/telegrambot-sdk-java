package com.xiluwang.telegrambot.sdk.model.stickers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xiluwang.telegrambot.sdk.model.types.PhotoSize;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sticker {
    private String file_id;
    private String file_unique_id;
    private Integer width;
    private Integer height;
    private Boolean is_animated;
    private PhotoSize thumb;
    private String emoji;
    private String set_name;
    private MaskPosition mask_position;
    private Integer file_size;
}
