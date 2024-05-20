package et.telebof.requests;

public class UnbanChatMember extends AbstractBaseRequest<UnbanChatMember, Boolean> {
    public UnbanChatMember(Object chatId, long userId, RequestSender requestSender) {
        super(chatId, requestSender, "unbanChatMember");
        add("user_id", userId);
    }

    public UnbanChatMember onlyIfBanned(boolean onlyIfBanned){
        return add("only_if_banned", onlyIfBanned);
    }

    @Override
    public Boolean bind() {
        return (Boolean) requestSender.makeRequest(this);
    }
}
