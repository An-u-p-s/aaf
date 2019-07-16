package anups.aaf.builder.util;


import java.security.SecureRandom;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

public class ServiceUtility {
 
 public Model modelConfiguration(Model model, HttpServletRequest request){
	 StringBuilder urlBuilder = new StringBuilder();
	    urlBuilder.append(request.getScheme()).append("://");
		urlBuilder.append(request.getServerName()).append(":");
		urlBuilder.append(request.getServerPort()).append("/");
		urlBuilder.append(request.getContextPath());
	 model.addAttribute("PROJECT_URL",urlBuilder.toString());
	return model; 
 }
 
 public String getAlphaNumeric(int len) {
	 char[] ch = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
	 char[] c = new char[len];
	 SecureRandom secureRandom = new SecureRandom();
	 for(int i=0;i<len;i++) {  c[i] =ch[secureRandom.nextInt(ch.length)]; }
	 return new String(c);
 }
 
}