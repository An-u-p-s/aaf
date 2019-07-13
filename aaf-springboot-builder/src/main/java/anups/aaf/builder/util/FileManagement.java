package anups.aaf.builder.util;

import java.io.File;

public class FileManagement {

  public boolean createAFolder(String mainDir, String folderPath) {
  /* folderPath can be in com.package.something (or) com\\pacakage\\something (or) com/package/something 
   * It will convert into com\\package\\something format
   */
	boolean isCreated = false;
	folderPath = folderPath.replace(".", "\\").replace("/", "\\");
	StringBuilder sb = new StringBuilder(mainDir);
	for(String folder: folderPath.split("\\\\")) {
	  sb.append("\\").append(folder);
	  File file = new File(sb.toString());
	  if(!file.exists()) { file.mkdir();isCreated=true; }
	}
	return isCreated;	
  }

  public boolean deleteAFolder(String mainDir, String folderPath) {
	boolean isDeleted = false;  
	folderPath = folderPath.replace(".", "\\").replace("/", "\\");
	String[] folders = folderPath.split("\\\\");
	for(int index=folders.length-1;index>=0;index--) {
		String path = mainDir+"\\"+folderPath;
		File file = new File(path);
		if(file.exists() && file.list().length==0) { 
			file.delete();isDeleted = true;
			folderPath = folderPath.replace("\\"+folders[index], "");
		}
	}
	
	return isDeleted;
  }
  
}
