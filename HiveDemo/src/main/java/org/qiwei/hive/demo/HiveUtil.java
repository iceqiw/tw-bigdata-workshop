package org.qiwei.hive.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HiveUtil {

  public static Statement getStatement(String arg) throws SQLException {
    try {
      Class.forName("org.apache.hive.jdbc.HiveDriver");
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      System.exit(1);
    }

    Connection cnct = DriverManager.getConnection(arg);
    return cnct.createStatement();
  }

  public static void exeSQL(Statement stmt, String sql) throws SQLException {
    ResultSet res = stmt.executeQuery(sql);
    if (res.next()) {
      System.out.println(res.getString(1));
    }
  }
}
