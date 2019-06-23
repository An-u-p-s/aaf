package anups.aaf.builder.util;


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
 
}