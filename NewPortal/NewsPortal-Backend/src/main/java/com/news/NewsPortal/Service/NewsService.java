package com.news.NewsPortal.Service;

import com.news.NewsPortal.Entity.News;
import com.news.NewsPortal.Repository.NewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepo newsRepo;

    public List<News> getAllNews() {
        return newsRepo.findAll();
    }

    public void addComment(String comment) {
        News news = new News(comment);
         newsRepo.save(news);
    }
}
