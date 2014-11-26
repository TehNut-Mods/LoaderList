package loaderlist;

import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {

	@SubscribeEvent
	public void onChunkForce(ForgeChunkManager.ForceChunkEvent event) {
		if (ConfigHandler.logChunkForce) {
			Utils.writeCLLog(event.ticket.getModId() + " forcing the loading of the chunk at *X = " + String.valueOf(event.location.getCenterXPos()) + "* and *Z =" + String.valueOf(event.location.getCenterZPosition()) + "* in dimension " + String.valueOf(event.ticket.world.provider.getDimensionId()), ConfigHandler.logName + ".txt");
			if (ConfigHandler.showLoggingInConsole) {
				LoaderList.logger.info(event.ticket.getModId() + " forcing the loading of the chunk at *X = " + String.valueOf(event.location.getCenterXPos()) + "* and *Z =" + String.valueOf(event.location.getCenterZPosition()) + "* in dimension " + String.valueOf(event.ticket.world.provider.getDimensionId()));
			}
		}
	}

	@SubscribeEvent
	public void onChunkUnforce(ForgeChunkManager.UnforceChunkEvent event) {
		if (ConfigHandler.logChunkUnforce) {
			Utils.writeCLLog(event.ticket.getModId() + " unforcing the loading of the chunk at *X = " + String.valueOf(event.location.getCenterXPos()) + "* and *Z =" + String.valueOf(event.location.getCenterZPosition()) + "* in dimension " + String.valueOf(event.ticket.world.provider.getDimensionId()), ConfigHandler.logName + ".txt");
			if (ConfigHandler.showLoggingInConsole) {
				LoaderList.logger.info(event.ticket.getModId() + " unforcing the loading of the chunk at *X = " + String.valueOf(event.location.getCenterXPos()) + "* and *Z =" + String.valueOf(event.location.getCenterZPosition()) + "* in dimension " + String.valueOf(event.ticket.world.provider.getDimensionId()));
			}
		}
	}
}
