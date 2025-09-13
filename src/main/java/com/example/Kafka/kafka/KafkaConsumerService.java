package com.example.Kafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerService {

    @KafkaListener(topics = "rheltopic", groupId = "local_consumer")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
