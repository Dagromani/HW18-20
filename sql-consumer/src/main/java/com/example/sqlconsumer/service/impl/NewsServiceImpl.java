package com.example.sqlconsumer.service.impl;

import com.example.sqlconsumer.entity.News;
import com.example.sqlconsumer.repository.NewsRepository;
import com.example.sqlconsumer.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    @Override
    public void save(News news) {
        newsRepository.save(news);
    }
}
