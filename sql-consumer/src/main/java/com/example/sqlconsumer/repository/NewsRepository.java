package com.example.sqlconsumer.repository;

import com.example.sqlconsumer.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
