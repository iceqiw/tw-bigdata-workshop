# java jdbc 连接hive
    URL jdbc:hive2://localhost:10000/default
## 获取总数量
    select count(1) from Sales;

## 根据年份计算消费总额
```sql
  create table Sales_Built_Year(YearBuilt string , TotalPrice float )
  ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY ','
  STORED AS TEXTFILE;
```
 
    select YearBuilt,sum(SalePrice) from Sales group by YearBuilt;

    insert overwrite table Sales_Built_Year select YearBuilt,sum(SalePrice) from Sales group by YearBuilt;

## 输出每年的房价top 5 
```sql
select * from (
select YrSold, SalePrice,
rank() over (partition by YrSold order by SalePrice desc) as rank 
from Sales ) t where rank < 3;
```

## 选出热销的房型,根据bedroom数量

    select BedroomAbvGr,count(1) from Sales group by BedroomAbvGr;

## mapreduce

    hadoop jar /opt/hadoop/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.1.2.jar wordcount /tmp/wordcount.txt /tmp/output/