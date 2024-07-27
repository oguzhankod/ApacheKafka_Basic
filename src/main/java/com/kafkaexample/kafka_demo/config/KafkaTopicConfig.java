package com.kafkaexample.kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic baseTopic(){
        return TopicBuilder.name("newtopic")
               // .partitions()
                .build();
    }

    @Bean
    public NewTopic topicForJsonProduce(){
        return TopicBuilder.name("newtopic_json")
                .build();
    }
}
