package anups.db.ui.gen.core;

public class DbQueries {

  public String showDbs() {
	StringBuilder sb = new StringBuilder("SHOW DATABASES;");
    return sb.toString();
  }
	
  public String showTables(String database) {
	StringBuilder sb = new StringBuilder("SHOW TABLES FROM ");
	sb.append(database);
	return sb.toString();
  }
  
  public String showColumnInfo(String database, String tableName) {
	StringBuilder sb = new StringBuilder("SHOW COLUMNS FROM ");
	sb.append(database).append(".").append(tableName);  
	return sb.toString();
  }
}
