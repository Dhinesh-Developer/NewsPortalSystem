package com.news.NewsPortal.Admin;

import com.news.NewsPortal.AdminService.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserAdminController {

    @Autowired
    private AdminUserService adminUserService;

    @PostMapping("/adminNewUser")
    public String  addUser(@RequestParam("name") String name,
                          @RequestParam("email") String email,
                          @RequestParam("passwd") String passwd){
         adminUserService.newUser(name,email,passwd);
         return "home.html";
    }
}
