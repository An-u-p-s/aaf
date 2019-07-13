package anups.db.ui.gen.pojo;

import java.util.HashMap;
import java.util.List;

import lombok.Data;

@Data
public class DbSchema {
 List<String> listOfTables;
 HashMap<String,List<DbColumnPojo>> tableInfo;
}
