package com.xiluwang.telegrambot.sdk.java;

import com.xiluwang.telegrambot.sdk.messaging.MessageUtil;
import com.xiluwang.telegrambot.sdk.utility.TestUtility;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

@Ignore
public class MessagingTest {

    private final String CHAT_ID = "-440128053";
    private final String TEXT = "Hello From Bot";
    private final Integer MESSAGE_ID = 137;
    private final String PHOTO_URL =
            "https://1.img-dpreview.com/files/p/TS1200x900~sample_galleries/8484004248/3158989079.jpg";
    private final String PHOTO_PATH = "src/test/java/com/xiluwang/telegrambot/sdk/resources/3158989079.jpg";
    private final String VIDEO_URL = "";
    private final String VIDEO_PATH = "";

    @Test
    public void sendTextMessage_returnMessage() throws IOException {
        TestUtility.prettyPrintObject(
                MessageUtil.sendMessage(CHAT_ID, TEXT));
    }

    @Test
    public void replyToMessageWithText_returnMessage() throws IOException {
        TestUtility.prettyPrintObject(
                MessageUtil.replyMessage(CHAT_ID, TEXT, MESSAGE_ID));
    }

    @Test
    public void deleteMessage() throws IOException {
        TestUtility.prettyPrintObject(
                MessageUtil.deleteMessage(CHAT_ID, 147));
    }

    @Test
    public void sentPhotoByURL_returnMessage() throws IOException {
        TestUtility.prettyPrintObject(
                MessageUtil.sendPhotoByUrl(CHAT_ID, PHOTO_URL));
    }

    @Test
    public void sendPhotoByUploadFile_returnMessage() throws IOException {
        TestUtility.prettyPrintObject(
                MessageUtil.sendPhotoByFile(CHAT_ID, PHOTO_PATH));
    }

    public void sendVideoByUrl_returnMessage() {}

    public void sendVideoByUploadFile_returnMessage() {}
}
