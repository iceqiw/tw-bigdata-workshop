package org.qiwei.hive.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HiveJDBCTest {

  public static final  String SQLPATH ="/Users/wei.qi/workspace/tw_work/workshop/tw-bigdata-workshop/hive-demo/src/main/script/test.sql";

  public static void main(String[] args) throws SQLException, IOException {
    try {
      Class.forName("org.apache.hive.jdbc.HiveDriver");
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      System.exit(1);
    }

    Connection cnct = DriverManager.getConnection(args[0]);
    Statement stmt = cnct.createStatement();
    String sql = "show tables";
    System.out.println("Running: " + sql);
    exeSQL(stmt, sql);

    String sqlScript=new String(Files.readAllBytes(Paths.get(SQLPATH)));
    System.out.println("Running script: " + sqlScript);

    for (String s : sqlScript.split(";")) {
      exeSQL(stmt, s);
    }
  }

  private static void exeSQL(Statement stmt, String sql) throws SQLException {
    ResultSet res = stmt.executeQuery(sql);
    if (res.next()) {
      System.out.println(res.getString(1));
    }
  }

}
