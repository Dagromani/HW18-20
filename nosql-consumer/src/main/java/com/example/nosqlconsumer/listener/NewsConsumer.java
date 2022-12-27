package com.example.nosqlconsumer.listener;

import com.example.nosqlconsumer.models.News;
import com.example.nosqlconsumer.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewsConsumer {

    private final NewsService newsService;

    @KafkaListener(topics = "news-topic" , groupId = "group-id")
    public void consumeNews(String msg) {
        System.out.println(msg);
        newsService.save(new News(msg));
    }
}
