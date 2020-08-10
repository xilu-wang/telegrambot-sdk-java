package com.xiluwang.telegrambot.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingAddress {
    private String country_code;
    private String state;
    private String city;
    private String street_line1;
    private String street_line2;
    private String post_code;
}
