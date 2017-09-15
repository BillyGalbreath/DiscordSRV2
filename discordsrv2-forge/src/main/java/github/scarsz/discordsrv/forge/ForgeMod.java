package github.scarsz.discordsrv.forge;

import github.scarsz.discordsrv.commmon.DiscordSRV;
import github.scarsz.discordsrv.commmon.DiscordSRVBuilder;
import github.scarsz.discordsrv.commmon.HelloWorld;
import github.scarsz.discordsrv.commmon.exceptions.BuildException;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = ForgeMod.MOD_ID,
        name = ForgeMod.MOD_NAME,
        version = ForgeMod.VERSION,
        serverSideOnly = true,
        acceptableRemoteVersions = "*"
)
public class ForgeMod {

    public static final String MOD_ID = "discordsrv";
    public static final String MOD_NAME = "DiscordSRV";
    public static final String VERSION = "1.0-SNAPSHOT";

    @Mod.Instance(MOD_ID)
    public static ForgeMod INSTANCE;
    public static final Logger logger = LogManager.getLogger(MOD_NAME);

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        DiscordSRV manager = null;
        try {
            manager = new DiscordSRVBuilder()
                    .setBotToken("")
                    .build();
        } catch (BuildException e) {
            e.printStackTrace();
        }
        if (manager == null) {
            logger.error("DiscordSRV failed to build correctly. Mod will not start.");
        }

        logger.info(HelloWorld.getMessage());
    }

}
