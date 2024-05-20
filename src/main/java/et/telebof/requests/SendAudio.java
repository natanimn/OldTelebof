package et.telebof.requests;

import et.telebof.types.Message;
import et.telebof.types.MessageEntity;
import java.io.File;
import java.util.List;


public class SendAudio extends DefaultParameters<SendAudio, Message> {
    public SendAudio(Object chatId, String audio, RequestSender requestSender) {
        super(chatId, requestSender, "sendAudio");
        add("audio", audio);
    }

    public SendAudio(Object chatId, File audio, RequestSender requestSender) {
        super(chatId, requestSender, "sendAudio");
        add("audio", audio);
        setContentType(MediaContentType.AUDIO);
    }

    public SendAudio caption(String cap) {
        return add("caption", cap);
    }

    public SendAudio captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", List.of(captionEntities));
    }

    public SendAudio duration(int duration) {
        return add("duration", duration);
    }

    public SendAudio performer(String performer) {
        return add("performer", performer);
    }

    public SendAudio title(String title) {
        return add("title", title);
    }

    public SendAudio thumbnail(String thumbnail) {
        return add("thumbnail", thumbnail);
    }

    public SendAudio thumbnail(File thumbnail) {
        return add("thumbnail", thumbnail);
    }

}
