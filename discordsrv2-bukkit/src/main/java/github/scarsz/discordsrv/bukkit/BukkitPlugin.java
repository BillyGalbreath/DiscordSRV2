package github.scarsz.discordsrv.bukkit;

import github.scarsz.discordsrv.commmon.HelloWorld;
import org.bukkit.plugin.java.JavaPlugin;

public final class BukkitPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(HelloWorld.getMessage());
    }

}
