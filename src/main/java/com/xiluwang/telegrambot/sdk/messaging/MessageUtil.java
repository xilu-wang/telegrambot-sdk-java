package com.xiluwang.telegrambot.sdk.messaging;

import com.xiluwang.telegrambot.sdk.api.BotApi;
import com.xiluwang.telegrambot.sdk.model.types.Message;
import com.xiluwang.telegrambot.sdk.utility.Endpoint;
import com.xiluwang.telegrambot.sdk.utility.ResourceLoader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.xiluwang.telegrambot.sdk.utility.TestUtility.objectToJsonString;

public class MessageUtil {

    private static final String HOST_URL = ResourceLoader.getBaseUrl() + ResourceLoader.getToken();

    /**
     * This will send a text message to the chat specified with the chat Id.
     * @param chatId the id of the target chat
     * @param text the message content you are sending
     * @return Message object
     * @throws IOException when API response cannot parse to Message
     */
    public static Message sendMessage(String chatId, String text) throws IOException {
        String url = HOST_URL + Endpoint.SEND_MESSAGE.getValue();
        TextMessageRequest request = TextMessageRequest.builder()
                .chatId(chatId)
                .text(text)
                .build();
        return (Message) BotApi.post(url, objectToJsonString(request), Message.class);
    }

    /**
     * This method will reply a message with text.
     * @param chatId the id of the target chat
     * @param text the message content you are sending
     * @param replyMessageId the message you are replying
     * @return Message object
     * @throws IOException when API response cannot parse to Message
     */
    public static Message replyMessage(String chatId, String text, Integer replyMessageId) throws IOException {
        String url = HOST_URL + Endpoint.SEND_MESSAGE.getValue();
        TextMessageRequest request = TextMessageRequest.builder()
                .chatId(chatId)
                .text(text)
                .replyToMessageId(replyMessageId)
                .build();
        return (Message) BotApi.post(url, objectToJsonString(request), Message.class);
    }

    /**
     * This method will delete the message by chat id and message id.
     * @param chatId the id of the target chat
     * @param messageId the message you are deleting
     * @throws IOException when API response is not right
     */
    public static Boolean deleteMessage(String chatId, Integer messageId) throws IOException {
        String url = HOST_URL + Endpoint.DELETE_MESSAGE.getValue();
        Map<String, Object> params = new HashMap<>();
        params.put("chat_id", chatId);
        params.put("message_id", messageId);
        return (Boolean) BotApi.post(url, objectToJsonString(params), Boolean.class);
    }

    /**
     * This method will send a photo by the photo url.
     * @param chatId the id of the target chat
     * @param photoUrl the photo url
     * @return Message object
     * @throws IOException when API response cannot parse to Message
     */
    public static Message sendPhotoByUrl(String chatId, String photoUrl) throws IOException {
        String url = HOST_URL + Endpoint.SEND_PHOTO.getValue();
        PhotoMessageRequest request = PhotoMessageRequest.builder()
                .chatId(chatId)
                .photo(photoUrl)
                .build();
        return (Message) BotApi.post(url, objectToJsonString(request), Message.class);
    }

    /**
     * This method will send a photo by uploading from the local file system.
     * @param chatId the id of the target chat
     * @param localFilePath the absolute path of the photo
     * @return Message Object
     * @throws IOException when API response cannot parse to Message
     */
    public static Message sendPhotoByFile(String chatId, String localFilePath) throws IOException {
        String url = HOST_URL + Endpoint.SEND_PHOTO.getValue();
        Map<String, String> params = new HashMap<>();
        params.put("chat_id", chatId);
        return (Message) BotApi.postFile(url, params, "photo", localFilePath, Message.class);
    }

    /**
     * This method will send a photo by the photo url.
     * @param chatId the id of the target chat
     * @param videoUrl the video url
     * @return Message object
     * @throws IOException when API response cannot parse to Message
     */
    public static Message sendVideoByUrl(String chatId, String videoUrl) throws IOException {
        String url = HOST_URL + Endpoint.SEND_VIDEO.getValue();
        VideoMessageRequest request = VideoMessageRequest.builder()
                .chatId(chatId)
                .video(videoUrl)
                .build();
        return (Message) BotApi.post(url, objectToJsonString(request), Message.class);
    }

    /**
     * This method will send a file by uploading from the local file system.
     * @param chatId the id of the target chat
     * @param videoLocation the absolute path of the video
     * @return Message object
     * @throws IOException when API response cannot parse to Message
     */
    public static Message sendVideoByFile(String chatId, String videoLocation) throws IOException {
        String url = HOST_URL + Endpoint.SEND_VIDEO.getValue();
        Map<String, String> params = new HashMap<>();
        params.put("chat_id", chatId);
        return (Message) BotApi.postFile(url, params, "video", videoLocation, Message.class);
    }
}
