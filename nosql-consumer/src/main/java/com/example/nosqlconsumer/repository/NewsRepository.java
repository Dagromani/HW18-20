package com.example.nosqlconsumer.repository;

import com.example.nosqlconsumer.models.News;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsRepository extends MongoRepository<News, String> {
}
