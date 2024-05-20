package et.telebof.types;

import java.io.Serializable;


public class BotCommand implements Serializable {
    private String command, description;

    public BotCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public BotCommand command(String command) {
        this.command = command;
        return this;
    }

    public BotCommand description(String description) {
        this.description = description;
        return this;
    }

    public String getCommand() {
        return command;
    }

    public String getDescription() {
        return description;
    }
}
