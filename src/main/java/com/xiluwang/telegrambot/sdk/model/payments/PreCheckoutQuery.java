package com.xiluwang.telegrambot.sdk.model.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xiluwang.telegrambot.sdk.model.types.User;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreCheckoutQuery {
    private String id;
    private User from;
    private String currency;
    private Integer total_amount;
    private String invoice_payload;
    private String shipping_option_id;
    private OrderInfo order_info;
}
