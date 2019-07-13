package anups.db.ui.gen.pojo;

import java.util.HashMap;
import java.util.List;

import lombok.Data;

@Data
public class DbServer {
 List<String> listOfDatabases;
 HashMap<String,DbSchema> dbSchema;
}
