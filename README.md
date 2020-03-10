# book-server
the back-end of book recommender system
# 项目启动流程

1.启动Zookeeper
```shell
[root@wan wan]# cd zookeeper/
[root@wan zookeeper]# ./bin/zkServer.sh start
ZooKeeper JMX enabled by default
Using config: /home/wan/zookeeper/bin/../conf/zoo.cfg
Starting zookeeper ... STARTED
```
2.启动Kafka
```shell
[root@wan wan]# cd kafka/
[root@wan kafka]# ./bin/kafka-server-start.sh -daemon ./config/server.properties
```
3.启动MongoDB
```shell
[root@wan wan]# cd mongodb/
[root@wan mongodb]# ./bin/mongod -config ./data/mongodb.conf
about to fork child process, waiting until server is ready for connections.
forked process: 12440
child process started successfully, parent exiting
```
4.启动Redis
```shell
[root@wan wan]# cd redis/
[root@wan redis]# redis-server ./redis.conf
12728:C 10 Mar 03:12:33.018 # oO0OoO0OoO0Oo Redis is starting oO0OoO0OoO0Oo
12728:C 10 Mar 03:12:33.018 # Redis version=4.0.2, bits=64, commit=00000000, modified=0, pid=12728, just started
12728:C 10 Mar 03:12:33.018 # Configuration loaded
```
5.启动Spark
```shell
[root@wan wan]# cd spark/
[root@wan spark]# ./sbin/start-all.sh
starting org.apache.spark.deploy.master.Master, logging to /home/wan/spark/logs/spark-root-org.apache.spark.deploy.master.Master-1-wan.out
root@wan's password:
wan: starting org.apache.spark.deploy.worker.Worker, logging to /home/wan/spark/logs/spark-root-org.apache.spark.deploy.worker.Worker-1-wan.out

```
6.启动ES(不能使用root)
```shell
[root@wan spark]# su wan
[wan@wan ~]$ cd elasticsearch/
[wan@wan elasticsearch]$ ./bin/elasticsearch -d

```
7.启动Flume
```shell
[root@wan wan]# cd apache-flume/
[root@wan apache-flume]# ./bin/flume-ng agent -c ./conf/ -f ./job/ex4.conf -n a1 -Dflume.root.logger=INFO,console
```
8.启动Spring Boot
```shell
[root@wan wan]# java -jar systemservice-2.0.4.RELEASE.jar
```

### 修改埋点时机
### 添加Swagger API文档
