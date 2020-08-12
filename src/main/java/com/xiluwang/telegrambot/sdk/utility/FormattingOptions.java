package com.xiluwang.telegrambot.sdk.utility;

public enum FormattingOptions {

    MARKDOWN("MarkdownV2"),
    HTML("HTML"),
    MARKDOWN_LEGACY("Markdown");

    private String value;

    FormattingOptions(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
