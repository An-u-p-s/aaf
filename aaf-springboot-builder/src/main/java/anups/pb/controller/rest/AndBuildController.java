package anups.pb.controller.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import anups.aaf.builder.service.AndBuildService;

@RestController
@RequestMapping(value="/service",method=RequestMethod.POST)
public class AndBuildController {

  @RequestMapping(value="/androidClassesBuilder",method=RequestMethod.POST)
  public String androidClassesBuilder(HttpServletRequest request) {
	String projectDrivePath = (String) request.getParameter("projectDrivePath");
	String projectPackageName = (String) request.getParameter("projectPackageName");
	
	AndBuildService andBuildService = new AndBuildService();
	String status = andBuildService.andBuilder(projectDrivePath, projectPackageName);
	return status;
  }
	
  
  
}
