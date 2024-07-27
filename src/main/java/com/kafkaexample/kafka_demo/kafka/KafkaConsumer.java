package com.kafkaexample.kafka_demo.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "newtopic",groupId = "myGroup")
    public void consume(String message){
        log.info("Message received -> %s" +message);
    }


}
