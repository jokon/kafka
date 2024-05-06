package com.example.kafka.service;

import com.example.kafka.msg.AccountStateChange;
import com.example.kafka.msg.SimpleMessage;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
    @KafkaListener(id = "myListener",
                   autoStartup = "${listen.auto.start:true}", concurrency = "${listen.concurrency:3}",
                   topicPartitions = {
                            @TopicPartition(topic = "quickstart-events", partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0")),
                           },
                   containerFactory = "kafkaListenerContainerFactory")
public class MultiTypeKafkaListener {

    @KafkaHandler
    public void handleSimpleMessage(@Payload SimpleMessage simpleMessage) {
        System.out.println("Simple message received: " + simpleMessage);
    }

    @KafkaHandler
    public void handleAccountStateChange(@Payload AccountStateChange accountStateChange) {
        System.out.println("State changed received: " + accountStateChange);
    }

    @KafkaHandler(isDefault = true)
    public void unknown(@Payload Object object) {
        System.out.println("Unknown type received: " + object);
    }
}
