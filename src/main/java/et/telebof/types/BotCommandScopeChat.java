package et.telebof.types;

public class BotCommandScopeChat extends BotCommandScope {
    private Object chat_id;
    public BotCommandScopeChat(Object chatId) {
        super("chat");
        this.chat_id = chatId;
    }
}
