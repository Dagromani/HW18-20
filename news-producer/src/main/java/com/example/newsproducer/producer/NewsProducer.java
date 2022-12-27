package com.example.newsproducer.producer;

import com.example.newsproducer.constants.NewsTopicConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewsProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMsg(String msg) {
        kafkaTemplate.send(NewsTopicConstants.NEWS_TOPIC, msg);
    }
}
