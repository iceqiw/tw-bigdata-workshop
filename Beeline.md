Beeline和其他工具有一些不同，执行查询都是正常的SQL输入，但是如果是一些管理的命令，

比如进行连接，中断，退出，执行Beeline命令需要带上“！”，不需要终止符。常用命令介绍：

1、!connect url –连接不同的Hive2服务器

2、!exit –退出shell

3、!help –显示全部命令列表

4、!verbose –显示查询追加的明细

The Beeline CLI 支持以下命令行参数:  
Option  
Description  
--autoCommit=[true/false] ---进入一个自动提交模式：beeline --autoCommit=true  
--autosave=[true/false]   ---进入一个自动保存模式：beeline --autosave=true  
--color=[true/false]    ---显示用到的颜色：beeline --color=true  
--delimiterForDSV= DELIMITER ---分隔值输出格式的分隔符。默认是“|”字符。  
--fastConnect=[true/false]  ---在连接时，跳过组建表等对象：beeline --fastConnect=false  
--force=[true/false]    ---是否强制运行脚本：beeline--force=true  
--headerInterval=ROWS   ---输出的表间隔格式，默认是100: beeline --headerInterval=50  
--help ---帮助  beeline --help  
--hiveconf property=value  ---设置属性值，以防被hive.conf.restricted.list重置：beeline --hiveconf prop1=value1   
--hivevar name=value   ---设置变量名：beeline --hivevar var1=value1  
--incremental=[true/false]  ---输出增量
--isolation=LEVEL  ---设置事务隔离级别：beeline --isolation=TRANSACTION_SERIALIZABLE  
--maxColumnWidth=MAXCOLWIDTH ---设置字符串列的最大宽度：beeline --maxColumnWidth=25  
--maxWidth=MAXWIDTH ---设置截断数据的最大宽度：beeline --maxWidth=150  
--nullemptystring=[true/false]  ---打印空字符串：beeline --nullemptystring=false  
--numberFormat=[pattern]     ---数字使用DecimalFormat：beeline --numberFormat="#,###,##0.00"  
--outputformat=[table/vertical/csv/tsv/dsv/csv2/tsv2] ---输出格式：beeline --outputformat=tsv   
--showHeader=[true/false]   ---显示查询结果的列名：beeline --showHeader=false  
--showNestedErrs=[true/false] ---显示嵌套错误：beeline --showNestedErrs=true  
--showWarnings=[true/false] ---显示警告：beeline --showWarnings=true  
--silent=[true/false]  ---减少显示的信息量：beeline --silent=true  
--truncateTable=[true/false] ---是否在客户端截断表的列     
--verbose=[true/false]  ---显示详细错误信息和调试信息：beeline --verbose=true  
-d <driver class>  ---使用一个驱动类：beeline -d driver_class  
-e <query>  ---使用一个查询语句：beeline -e "query_string"  
-f <file>  ---加载一个文件：beeline -f filepath  多个文件用-e file1 -e file2
-n <username>  ---加载一个用户名：beeline -n valid_user  
-p <password>  ---加载一个密码：beeline -p valid_password  
-u <database URL> ---加载一个JDBC连接字符串：beeline -u db_URL 
