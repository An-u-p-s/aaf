package anups.pb.controller.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import anups.db.ui.gen.service.DbSchemaService;

@RestController
@RequestMapping(value="/dbui",method=RequestMethod.GET)
public class DbuiController {

  @RequestMapping(value="/dbschema/getinfo",method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public String dbSchema_getInfo(/*@RequestParam String databaseServer, @RequestParam String serverIPAddress, 
		  @RequestParam String serverPort, @RequestParam String username, @RequestParam String password */) {
	String databaseServer = "MYSQL_DATABASE";
    String serverIPAddress = "localhost";
	String serverPort = "3306";
	String username = "root";
	String password = "";
    return new DbSchemaService().getDatabaseServerSchema(databaseServer, serverIPAddress, serverPort, username, password);
  }
  
}
