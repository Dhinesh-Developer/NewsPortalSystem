package com.news.NewsPortal.AdminService;

import com.news.NewsPortal.Entity.News;
import com.news.NewsPortal.Repository.NewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminNewsService {

    @Autowired
    private NewsRepo newsRepo;

    public void insertNewNewsArticle(String author, String title, String content, String comment, String date) {
        News news = new News(author,title,content,comment,date);
        newsRepo.save(news);
    }


    public void saveNews(News news) {
        newsRepo.save(news);
    }

    public void addComment(int id, String comment) {
        News news = newsRepo.findById(id).orElseThrow(() -> new RuntimeException("News not found"));
        news.setComment(comment);
        newsRepo.save(news);
    }


    public News getNewsById(int id) {
        return newsRepo.findById(id).orElse(null);
    }
}
