package loaderlist;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

	public static Configuration config;

	public static String general = "general";

	public static String logName;
	public static boolean logChunkForce;
	public static boolean logChunkUnforce;
	public static boolean showLoggingInConsole;

	public static void init(File file) {
		config = new Configuration(file);
		syncConfig();
		config.load();
	}

	public static void syncConfig() {

		logName = config.get(general, "logName", "ChunkLoaderList", "Name for the chunkloader list file. A .txt extension will automagically be applied.").getString();
		logChunkForce = config.get(general, "logChunkForce", true, "Toggle logging of forcing chunks.").getBoolean(logChunkForce);
		logChunkUnforce = config.get(general, "logChunkUnforce", false, "Toggle logging of unforcing chunks.").getBoolean(logChunkUnforce);
		showLoggingInConsole = config.get(general, "showLoggingInConsole", false, "Show the logging in the console. Generally only used for debugging purposes.").getBoolean(showLoggingInConsole);

		config.save();
	}
}
