package github.scarsz.discordsrv;

import github.scarsz.discordsrv.commmon.HelloWorld;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = DiscordSRV.MOD_ID,
        name = DiscordSRV.MOD_NAME,
        version = DiscordSRV.VERSION,
        serverSideOnly = true,
        acceptableRemoteVersions = "*"
)
public class DiscordSRV {

    public static final String MOD_ID = "discordsrv";
    public static final String MOD_NAME = "DiscordSRV";
    public static final String VERSION = "1.0-SNAPSHOT";

    @Mod.Instance(MOD_ID)
    public static DiscordSRV INSTANCE;
    public static final Logger logger = LogManager.getLogger(MOD_NAME);

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info(HelloWorld.getMessage());
    }

}
