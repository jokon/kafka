package com.example.kafka.service;

import com.example.kafka.msg.SimpleMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class ConsumeMessage {

    @KafkaListener(id = "myListener",
                   autoStartup = "${listen.auto.start:true}", concurrency = "${listen.concurrency:3}",
                   topicPartitions = {
                            @TopicPartition(topic = "quickstart-events", partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0")),
                           })
    public void listener(SimpleMessage message) {
        System.out.println("Received SimpleMessage: " + message);
    }

}
