package com.npcgo.snowclientdemo.controller;


import com.npcgo.domain.User;
import com.npcgo.snowclientdemo.service.UserApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController  {



    @Autowired
    private UserApiService userAPI;

    //@Override
    @PostMapping("/greeting")
    public String getString(@RequestBody User user) {
        return  userAPI.getString(user);
    }
    @GetMapping("/index")
    public  String helloWorld()
    {
        return  userAPI.HelloWorld();
    }
}
