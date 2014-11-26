package loaderlist;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION, dependencies = ModInformation.DEPEND, acceptableRemoteVersions = "*")
public class LoaderList {

	public static Logger logger = LogManager.getLogger(ModInformation.NAME);

	@Mod.Instance
	public static LoaderList instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());

		MinecraftForge.EVENT_BUS.register(new EventHandler());
	}
}
