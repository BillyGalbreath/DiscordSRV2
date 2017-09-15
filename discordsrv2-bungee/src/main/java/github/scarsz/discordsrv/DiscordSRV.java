package github.scarsz.discordsrv;

import github.scarsz.discordsrv.commmon.HelloWorld;
import net.md_5.bungee.api.plugin.Plugin;

public final class DiscordSRV extends Plugin {

    @Override
    public void onEnable() {
        getLogger().info(HelloWorld.getMessage());
    }

}
