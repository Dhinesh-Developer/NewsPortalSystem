package com.news.NewsPortal.Controller;

import com.news.NewsPortal.Exception.UserException;
import com.news.NewsPortal.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/newuser")
    public String createUser(@RequestParam("name") String name,
                             @RequestParam("email") String email,
                             @RequestParam("passwd") String passwd){
        userService.createUser(name,email,passwd);
        return "Registered successfully";
    }

    @GetMapping("/olduser")
    public String loginValidate(@RequestParam("email") String email,
                                @RequestParam("passwd") String passwd){
        boolean res = userService.loginValidate(email);
        if(res== true){
            return "User Found";
        }else{
            return "User Not Found";
        }
    }
}
