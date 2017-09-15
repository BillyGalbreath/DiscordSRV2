package github.scarsz.discordsrv;

import github.scarsz.discordsrv.commmon.HelloWorld;
import net.dv8tion.jda.core.JDA;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiscordSRV extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(HelloWorld.getMessage());

        JDA jda = null;
    }

}
