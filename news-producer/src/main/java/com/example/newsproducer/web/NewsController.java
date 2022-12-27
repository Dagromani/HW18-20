package com.example.newsproducer.web;

import com.example.newsproducer.producer.NewsProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsController {

    private final NewsProducer producer;

    @PostMapping("/post")
    public void postNews(@RequestBody String body) {
        producer.sendMsg(body);
    }
}
