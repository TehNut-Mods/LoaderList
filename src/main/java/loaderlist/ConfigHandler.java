package loaderlist;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

	public static Configuration config;

	public static String logName;

	public static void init(File file) {
		config = new Configuration(file);
		syncConfig();
	}

	public static void syncConfig() {

		logName = config.get("general", "logName", "ChunkLoaderList", "Name for the chunkloader list file. A .txt extension will automagically be applied.").getString();

		config.save();
	}
}
