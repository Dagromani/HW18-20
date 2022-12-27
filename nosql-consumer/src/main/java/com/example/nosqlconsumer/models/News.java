package com.example.nosqlconsumer.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("news-topic")
public class News {

    @Id
    private String id;
    private String title;
    private String body;

    public News(String body) {
        this.body = body;
    }
}
