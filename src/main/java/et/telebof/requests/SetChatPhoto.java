package et.telebof.requests;

import java.io.File;

public class SetChatPhoto extends AbstractBaseRequest<SetChatPhoto, Boolean> {
    public SetChatPhoto(Object chatId, File photo, RequestSender requestSender) {
        super(chatId, requestSender, "setChatPhoto");
        add("photo", photo);
        setContentType(MediaContentType.PHOTO);
    }

    @Override
    public Boolean bind() {
        return (Boolean) requestSender.makeRequest(this);
    }
}
