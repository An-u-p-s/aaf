package anups.db.ui.gen.service;

import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import anups.db.ui.gen.core.DbInstaller;
import anups.db.ui.gen.pojo.DbColumnPojo;
import anups.db.ui.gen.pojo.DbSchema;
import anups.db.ui.gen.pojo.DbServer;

public class DbSchemaService {

  public String getDatabaseServerSchema(String databaseServer, String serverIPAddress, String serverPort,
		  							  String username, String password) {
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	DbInstaller dbInstaller = new DbInstaller(databaseServer, serverIPAddress, serverPort, username, password);
	List<String> databases = dbInstaller.listOfDbs();
	HashMap<String,DbSchema> databaseSchema = new HashMap<String,DbSchema>();
	for(int dbIndex=0;dbIndex<databases.size();dbIndex++) {
	  String databaseName = databases.get(dbIndex);
	  List<String> tables = dbInstaller.listOfTables(databaseName);
	  HashMap<String,List<DbColumnPojo>> tableInfo = new  HashMap<String,List<DbColumnPojo>>();
	  for(int tblIndex=0;tblIndex<tables.size();tblIndex++) {
		 String tableName = tables.get(tblIndex);
		 List<DbColumnPojo> columnsInfo = dbInstaller.listOfColumnInfo(databaseName, tableName);
		 tableInfo.put(tableName, columnsInfo);
	  }
	  DbSchema dbSchema = new DbSchema();
	        dbSchema.setListOfTables(tables);
	        dbSchema.setTableInfo(tableInfo);
	 databaseSchema.put(databaseName, dbSchema);
	}
	DbServer dbServer = new DbServer();
	dbServer.setListOfDatabases(databases);
	dbServer.setDbSchema(databaseSchema);
	return gson.toJson(dbServer); 
  }

}
