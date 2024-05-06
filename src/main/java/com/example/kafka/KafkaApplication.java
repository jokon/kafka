package com.example.kafka;

import com.example.kafka.msg.SimpleMessage;
import com.example.kafka.service.ConsumeMessage;
import com.example.kafka.service.SendMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.listener.MessageListener;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(KafkaApplication.class, args);
		SendMessage producer = context.getBean(SendMessage.class);
		producer.sendSimpleMessage(new SimpleMessage("Hi there!", "Jurek Owsiak", 2024));

    }

}
