package loaderlist;

import net.minecraftforge.common.DimensionManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {

	public static void writeCLLog(String info, String fileName) {
		try {
			File log = new File(String.valueOf(DimensionManager.getCurrentSaveRootDirectory()) + "/" + fileName);
			if (!log.exists()) {
				if (log.createNewFile()) {
					LoaderList.logger.info("Creating " + fileName + " in " + String.valueOf(DimensionManager.getCurrentSaveRootDirectory()));
				}
			}
			FileWriter fileWriter = new FileWriter(log.getAbsoluteFile(), true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(info);
			bufferedWriter.newLine();
			bufferedWriter.close();
		} catch (IOException e) {
			LoaderList.logger.error(fileName + " was not found in " + String.valueOf(DimensionManager.getCurrentSaveRootDirectory()));
		}
	}
}
