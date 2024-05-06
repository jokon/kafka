
### Apache Kafka sources 
[download Apache Kafka here](https://www.apache.org/dyn/closer.cgi?path=/kafka/3.7.0/kafka_2.13-3.7.0.tgz)


### Run Kafka from Docker
```
docker run -p 9092:9092 apache/kafka:3.7.0
```

## From downloaded sources:

### Consumer
```
bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
```
### Producer
```
bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092
```