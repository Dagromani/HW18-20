package com.example.nosqlconsumer.service.impl;

import com.example.nosqlconsumer.models.News;
import com.example.nosqlconsumer.repository.NewsRepository;
import com.example.nosqlconsumer.service.NewsService;
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
