package com.news.NewsPortal.Controller;

import com.news.NewsPortal.Entity.News;
import com.news.NewsPortal.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class NewsController {

    @Autowired
    private NewsService newsService;


    @GetMapping("/news")
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

    @PostMapping("/addComment")
    public String addCommentToNews( @RequestParam String comment) {
        newsService.addComment( comment);
        return "Comment added successfully!";
    }
}
