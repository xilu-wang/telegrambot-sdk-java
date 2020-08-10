package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatPhoto {
    private String small_file_id;
    private String small_file_unique_id;
    private String big_file_id;
    private String big_file_unique_id;
}
