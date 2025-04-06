package com.news.NewsPortal.AdminService;

import com.news.NewsPortal.Entity.News;
import com.news.NewsPortal.Entity.User;
import com.news.NewsPortal.Repository.UserRepo;
import com.news.NewsPortal.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminUserService {

    @Autowired
    private UserRepo userRepo;

    public void newUser(String name, String email, String passwd) {
        User user = new User(name,email,passwd);
         userRepo.save(user);
    }


}
