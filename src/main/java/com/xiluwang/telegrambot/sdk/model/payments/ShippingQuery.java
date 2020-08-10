package com.xiluwang.telegrambot.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xiluwang.telegrambot.sdk.model.types.User;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingQuery {
    private String id;
    private User from;
    private String invoice_payload;
    private ShippingAddress shipping_address;
}
