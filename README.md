
### Apache Kafka sources 
[download Apache Kafka here](https://www.apache.org/dyn/closer.cgi?path=/kafka/3.7.0/kafka_2.13-3.7.0.tgz)

## Running Kafka
### from Docker
```
docker run -p 9092:9092 apache/kafka:3.7.0
```
### from sources

```
bin/zookeeper-server-start.sh config/zookeeper.properties
```
in file config/server.properties remove comment for: 
listeners=PLAINTEXT://:9092
```
bin/kafka-server-start.sh config/server.properties
```


### Run Consumer
```
bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
```
### Run Producer
```
bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092
```

### Topics related commands:
```
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic quickstart-events
bin/kafka-topics.sh --list --bootstrap-server localhost:9092
bin/kafka-topics.sh --describe  --bootstrap-server localhost:9092 --topic quickstart-events
```