package com.news.NewsPortal.Admin;

import com.news.NewsPortal.AdminService.AdminNewsService;
import com.news.NewsPortal.AdminService.AdminUserService;
import com.news.NewsPortal.Entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AdminNewsController {

    @Autowired
    private AdminNewsService adminNewsService;

    @PostMapping("/addAdminNews")
    public String insertNews(@RequestParam("author") String author,
                            @RequestParam("title") String title,
                            @RequestParam("content") String content,
                            @RequestParam("comment") String comment,
                            @RequestParam("date") String date){
        adminNewsService.insertNewNewsArticle(author,title,content,comment,date);
        return "add Successfully";
    }



    @PostMapping("/addNews")
    public String addNews(@RequestBody News news) {
        adminNewsService.saveNews(news);
        return "News added successfully!";
    }


    @PostMapping("/addAdminComment")
    public String addCommentToNews(@RequestParam int id, @RequestParam String comment) {
        adminNewsService.addComment(id, comment);
        return "Comment added successfully!";
    }

    @GetMapping("/news/{id}")
    public News getNewsById(@PathVariable int id) {
        return adminNewsService.getNewsById(id);
    }

}
