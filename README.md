## Hive 环境构建
#### github: https://github.com/iceqiw/bigdata-docker

* 构建镜像
    * 下载jdk
    * 修改配置dockerfile文件,将jdk修改为对应版本
    * 运行构建命令 docker build -t hd-container:1.0 .
* 构建集群容器
    * 下载hadoop3.1.2,hive3.1.2
    * 修改 docker-compose yml文件为对应版本,修改对应的配置文件存放路径
    * 启动集群 docker-compose -f mac-docker-compose-hive.yml up -d
    * 测试容器docker exec -it c46d734303b9 /bin/bash


## sparkstreaming-kafka 环境构建
#### github： https://github.com/gj122512597/workshop-sparkstreaming

