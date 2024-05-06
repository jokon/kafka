package com.example.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendMessage {


    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;


    public void sendSimpleMessage(Object msg) {
        kafkaTemplate.send("quickstart-events", msg);
    }

}
