package com.smst.weekend.project1;

// import java.math.BigDecimal;
import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;

public class SampleSingleton {

  private static Connection conn = null;

  private static SampleSingleton instance = null;

  public static SampleSingleton getInstance() {
    return instance;
  }

  // public static void databaseQuery(BigDecimal input) {
  // conn = DriverManager.getConnection("url of database");
  // Statement st = conn.createStatement();
  // ResultSet rs = st.executeQuery("select id from table");
  // int x = 0;
  // while (rs.next()) {
  // x = rs.getInt(1) * input;
  // }
  // }
}
