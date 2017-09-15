package github.scarsz.discordsrv.bungee;

import github.scarsz.discordsrv.commmon.HelloWorld;
import net.md_5.bungee.api.plugin.Plugin;

public final class BungeePlugin extends Plugin {

    @Override
    public void onEnable() {
        getLogger().info(HelloWorld.getMessage());
    }

}
