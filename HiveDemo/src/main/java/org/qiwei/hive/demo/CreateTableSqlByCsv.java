package org.qiwei.hive.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CreateTableSqlByCsv {

  public static final  String CSVPATH ="/Users/wei.qi/workspace/tw_work/workshop/tw-bigdata-workshop/script/sales.csv";

  public static void main(String[] args) throws IOException {
    List<String> csvFileLines=Files.readAllLines(Paths.get(CSVPATH));

    String header=csvFileLines.get(0);

    for(String col:header.split(",")){
      System.out.println(col+" "+"string ,");
    }

  }
}
