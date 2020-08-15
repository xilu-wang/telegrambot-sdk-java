package com.xiluwang.telegrambot.sdk.model.stickers;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MaskPosition {
    private String point;
    private Float x_shift;
    private Float y_shift;
    private Float scale;
}
