package anups.aaf.builder.service;

import java.io.File;

public class AndBuildService {
	
  public String andBuilder(String projectPath, String packageName) {
	String status =  "";
	/* Check Project path Exists or not */	
	File projectPathFolder = new File(projectPath);
	if(projectPathFolder.isDirectory()) {
		
	} else {
		status ="W001";
	}
   return status;
  }
}
