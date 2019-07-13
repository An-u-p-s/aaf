package anups.pb.controller.ui;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import anups.aaf.builder.util.ServiceUtility;

@Controller
public class UserInterfaceController {

  @RequestMapping(value="/")
  public String defaultPage(Model model, HttpServletRequest request) {
	ServiceUtility serviceUtility = new ServiceUtility();
	model = serviceUtility.modelConfiguration(model, request);
    return "index.jsp";
  }
  
  @RequestMapping(value="/projects/json/home")
  public String projects_json_home(Model model, HttpServletRequest request) {
	ServiceUtility serviceUtility = new ServiceUtility();
	model = serviceUtility.modelConfiguration(model, request);
    return "projects-json-home.jsp";
  }
  
  
}
