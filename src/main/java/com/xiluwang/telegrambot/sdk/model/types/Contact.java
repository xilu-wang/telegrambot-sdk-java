package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {
    private String phone_number;
    private String first_name;
    private String last_name;
    private Integer user_id;
    private String vcard;
}
