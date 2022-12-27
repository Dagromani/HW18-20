package com.example.sqlconsumer.listener;

import com.example.sqlconsumer.entity.News;
import com.example.sqlconsumer.service.NewsService;
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
