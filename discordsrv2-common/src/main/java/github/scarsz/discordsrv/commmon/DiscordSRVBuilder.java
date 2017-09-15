package github.scarsz.discordsrv.commmon;

import github.scarsz.discordsrv.commmon.exceptions.BuildException;

public class DiscordSRVBuilder {

    private String botToken = null;
    public DiscordSRVBuilder setBotToken(String botToken) {
        this.botToken = botToken;
        return this;
    }

    public DiscordSRV build() throws BuildException {
        if (botToken == null) throw new BuildException("botToken can not be null");

        return new DiscordSRV(botToken);
    }

}
