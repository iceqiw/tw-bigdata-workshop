package org.qiwei.hive.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.sql.Statement;

public class HiveJDBCScriptTest {

  public static final String SQLPATH =
      "/Users/wei.qi/workspace/tw_work/workshop/tw-bigdata-workshop/hive-demo/src/main/script/test.sql";

  public static void main(String[] args) throws SQLException, IOException {
    Statement stmt = HiveUtil.getStatement(args[0]);
    String sqlScript = new String(Files.readAllBytes(Paths.get(SQLPATH)));
    System.out.println("Running script: " + sqlScript);
    for (String s : sqlScript.split(";")) {
      HiveUtil.exeSQL(stmt, s);
    }
  }

}
