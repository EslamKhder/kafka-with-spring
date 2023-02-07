package com.spring.payed.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ConsumerService {

    @KafkaListener(topics = "${kafka.topic}")
    public String consume(Message<Map<String,Integer>> order){
        return "Payed Success With " + order.getPayload();
    }
}
