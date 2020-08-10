package com.xiluwang.telegrambot.sdk.model.updates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xiluwang.telegrambot.sdk.model.inline.ChosenInlineResult;
import com.xiluwang.telegrambot.sdk.model.inline.InlineQuery;
import com.xiluwang.telegrambot.sdk.model.payments.PreCheckoutQuery;
import com.xiluwang.telegrambot.sdk.model.payments.ShippingQuery;
import com.xiluwang.telegrambot.sdk.model.types.CallbackQuery;
import com.xiluwang.telegrambot.sdk.model.types.Message;
import com.xiluwang.telegrambot.sdk.model.types.Poll;
import com.xiluwang.telegrambot.sdk.model.types.PollAnswer;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Update {
    private Integer update_id;
    private Message message;
    private Message edited_message;
    private Message channel_post;
    private Message edited_channel_post;
    private InlineQuery inline_query;
    private ChosenInlineResult chosen_inline_result;
    private CallbackQuery callback_query;
    private ShippingQuery shipping_query;
    private PreCheckoutQuery pre_checkout_query;
    private Poll poll;
    private PollAnswer poll_answer;
}
