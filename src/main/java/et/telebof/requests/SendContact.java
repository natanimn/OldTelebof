package et.telebof.requests;

import et.telebof.Util;
import et.telebof.types.Markup;
import et.telebof.types.Message;
import et.telebof.types.ReplyParameters;

public class SendContact extends AbstractBaseRequest<SendContact, Message> {

    public SendContact(Object chatId, String phoneNumber, String firstName, RequestSender requestSender) {
        super(chatId, requestSender, "sendContact");
        add("phone_number", phoneNumber);
        add("first_name", firstName);
    }

    public SendContact lastName(String lastName) {
        return add("last_name", lastName);
    }

    public SendContact vcard(String vcard) {
        return add("vcard", vcard);
    }

    public SendContact disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public SendContact protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    @Deprecated(since = "v1.5.0")
    public SendContact replyToMessageId(int replyToMessageId) {
        return add("reply_to_message_id", replyToMessageId);
    }

    @Deprecated(since = "v1.5.0")
    public SendContact allowSendingWithoutReply(boolean allowSendingWithoutReply) {
        return add("allow_sending_without_reply", allowSendingWithoutReply);
    }

    public SendContact replyParameters(ReplyParameters parameters){
        return add("reply_parameters", parameters);
    }

    public SendContact replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    public SendContact businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }
    @Override
    public Message exec() {
        return Util.parse(requestSender.makeRequest(this), Message.class);
    }
}
