package com.npcgo.snowclientdemo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.npcgo.domain.User;


import com.npcgo.fallback.UserAPIFallback;
import com.npcgo.snowclientdemo.fallback.UserApiFallback;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "${service-provider.name}",fallback = UserApiFallback.class)
public interface UserApiService {

    @PostMapping("/greeting")

    String getString(User user);

    @GetMapping("/index")
    String HelloWorld();
}
