package com.kafkaexample.kafka_demo.kafka;

import com.kafkaexample.kafka_demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {

    @KafkaListener(topics = "newtopic_json",groupId = "myGroup")
    public void consume(User user){
        log.info("JsonKafkaConsumer received -> %s" + user.toString());
    }
}
