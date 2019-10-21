package org.qiwei.hive.demo;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

public class HiveJDBCTest {

  public static void main(String[] args) throws SQLException, IOException {
    Statement stmt = HiveUtil.getStatement(args[0]);
    String sql = "show tables";
    System.out.println("Running: " + sql);
    HiveUtil.exeSQL(stmt, sql);
  }
}
