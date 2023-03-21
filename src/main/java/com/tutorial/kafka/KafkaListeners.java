package com.tutorial.kafka;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {
    @KafkaListener( topics ="sunny", groupId ="groupId")
    public void listen(String data){
        System.out.println("The message is:" + data);
    }
}
