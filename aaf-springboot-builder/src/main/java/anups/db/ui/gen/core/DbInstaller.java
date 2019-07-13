package anups.db.ui.gen.core;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import anups.db.ui.gen.pojo.DbColumnPojo;

public class DbInstaller {

  private JdbcTemplate jdbcTemplate;
  
  public DbInstaller(String databaseServer, String serverIPAddress, String serverPort,
		  String username, String password) {
   String url = "";
   String driverClass = "";
	  
   if("MYSQL_DATABASE".equalsIgnoreCase(databaseServer)) {
		StringBuilder sb = new StringBuilder("jdbc:mysql://");
		sb.append(serverIPAddress).append(":").append(serverPort).append("?useSSL=false");
		url = sb.toString();
		driverClass = "com.mysql.jdbc.Driver";
   }
	
   DataSource dataSource = DataSourceBuilder.create()
			.driverClassName(driverClass)
			.url(url)
			.username(username)
			.password(password).build();
   
   this.jdbcTemplate = new JdbcTemplate(dataSource);
  }
	
  public List<String> listOfDbs(){
	  return jdbcTemplate.query(new DbQueries().showDbs(), new RowMapper<String>() {
		@Override
		public String mapRow(ResultSet rs, int rowNum) throws SQLException {
			return rs.getString("Database");
		}  
	  });
  }
  
  public List<String> listOfTables(String database){
	  return jdbcTemplate.query(new DbQueries().showTables(database), new RowMapper<String>() {
		@Override
		public String mapRow(ResultSet rs, int rowNum) throws SQLException {
		  return rs.getString("Tables_in_"+database);
		}  
	  });
  }
  
  public List<DbColumnPojo> listOfColumnInfo(String database, String tableName){
	  return jdbcTemplate.query(new DbQueries().showColumnInfo(database, tableName), new RowMapper<DbColumnPojo>() {
	   @Override
	   public DbColumnPojo mapRow(ResultSet rs, int rowNum) throws SQLException {
		 ResultSetMetaData rsmd = rs.getMetaData();
		 DbColumnPojo dbColumnPojo = new DbColumnPojo();
		     dbColumnPojo.setField(rs.getString("Field"));
		     dbColumnPojo.setType(rs.getString("Type"));
		     dbColumnPojo.setNull(rs.getString("Null"));
		     dbColumnPojo.setKey(rs.getString("Key"));
		     dbColumnPojo.setDefault(rs.getString("Default"));
		     dbColumnPojo.setExtra(rs.getString("Extra"));
		 return dbColumnPojo;
		
		}  
	  });
  }
  
  
}
