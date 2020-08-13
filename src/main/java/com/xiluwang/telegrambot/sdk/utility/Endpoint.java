package com.xiluwang.telegrambot.sdk.utility;

// TODO add more endpoint
public enum Endpoint {
    GET_UPDATE("/getUpdates"),
    GET_ME("/getMe"),
    SEND_MESSAGE("/sendMessage"),
    FORWARD_MESSAGE("/forwardMessage"),
    SEND_PHOTO("/sendPhoto"),
    SEND_AUDIO("/sendAudio"),
    SEND_DOCUMENT("/sendDocument"),
    SEND_VIDEO("/sendVideo"),
    SEND_ANIMATION("/sendAnimation"),
    SEND_VOICE("sendVoice"),
    SEND_VIDEO_NOTE("/sendVideoNote"),
    SEND_MEDIA_GROUP("/sendMediaGroup"),
    SEND_LOCATION("/sendLocation"),
    SEND_POLL("/sendPoll"),
    SEND_DICE("/sendDice"),
    GET_FILE("/getFile"),
    GET_CHAT("/getChat"),
    GET_CHAT_ADMIN("/getChatAdministrator"),
    GET_CHAT_MEMBERS_COUNT("/getChatMembersCount"),
    GET_CHAT_MEMBER("/getChatMember"),
    EDIT_MESSAGE_TEXT("/editMessageText"),
    EDIT_MESSAGE_CAPTION("/editMessageCaption"),
    DELETE_MESSAGE("/deleteMessage"),
    STOP_POLL("/stopPoll"),
    SEND_STICKER("/sendSticker");

    private String value;

    Endpoint(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
