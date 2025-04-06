package com.news.NewsPortal.Repository;

import com.news.NewsPortal.Entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepo extends JpaRepository<News,Integer> {
}
