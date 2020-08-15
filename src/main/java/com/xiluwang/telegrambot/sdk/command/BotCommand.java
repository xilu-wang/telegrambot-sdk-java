package com.xiluwang.telegrambot.sdk.command;

public enum BotCommand {
    START("/start");

    private String command;

    BotCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return this.command;
    }
}
