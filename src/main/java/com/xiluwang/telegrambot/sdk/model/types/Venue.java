package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Venue {
    private Location location;
    private String title;
    private String address;
    private String foursquare_id;
    private String foursquare_type;
}
