package com.kafkaexample.kafka_demo.controller;

import com.kafkaexample.kafka_demo.kafka.JsonKafkaProducer;
import com.kafkaexample.kafka_demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
public class JsonKafkaController {

    private final JsonKafkaProducer jsonKafkaProducer;

    public JsonKafkaController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json Message sent");
    }
}
