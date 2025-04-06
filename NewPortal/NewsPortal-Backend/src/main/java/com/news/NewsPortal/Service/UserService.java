package com.news.NewsPortal.Service;

import com.news.NewsPortal.Entity.User;
import com.news.NewsPortal.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void createUser(String name, String email, String passwd) {

        User user = new User(name,email,passwd);
        userRepo.save(user);
    }

    public boolean loginValidate(String email) {
        User res = userRepo.findByEmail(email);
        return res!=null;
    }
}
