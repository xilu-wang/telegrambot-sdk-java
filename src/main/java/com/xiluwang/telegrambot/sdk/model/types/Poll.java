package com.xiluwang.telegrambot.sdk.model.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Poll {
    private String id;
    private String question;
    private PollOption[] options;
    private Integer total_voter_count;
    private Boolean is_closed;
    private Boolean is_anonymous;
    private String type;
    private Boolean allows_multiple_answers;
    private Integer correct_option_id;
    private String explanation;
    private MessageEntity[] explanation_entities;
    private Integer open_period;
    private Integer close_date;
}
