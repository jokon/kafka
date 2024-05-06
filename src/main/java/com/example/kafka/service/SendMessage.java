package com.example.kafka.service;

import com.example.kafka.msg.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class SendMessage {


    @Autowired
    private KafkaTemplate<String, SimpleMessage> kafkaTemplate;


    public void sendSimpleMessage(SimpleMessage msg) {
        kafkaTemplate.send("quickstart-events", msg);
    }


}
