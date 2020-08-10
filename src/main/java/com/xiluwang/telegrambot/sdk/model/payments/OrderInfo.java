package com.xiluwang.telegrambot.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderInfo {
    private String name;
    private String phone_number;
    private String email;
    private ShippingAddress shipping_address;
}
