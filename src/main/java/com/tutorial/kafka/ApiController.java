package com.tutorial.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/message")
public class ApiController {
    private KafkaTemplate<String, String> kafkaTemplate;

    public ApiController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    @PostMapping("/")
    public void pushMessage(@RequestParam String Message){
        kafkaTemplate.send("sunny","API:" +Message);
    }

    @GetMapping("/")
    public void consoleMessages(){

    }


}
