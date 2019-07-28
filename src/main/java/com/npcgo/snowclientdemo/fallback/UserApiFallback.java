package com.npcgo.snowclientdemo.fallback;

import com.npcgo.domain.User;
import com.npcgo.snowclientdemo.service.UserApiService;
import org.springframework.stereotype.Component;

@Component
public class UserApiFallback implements UserApiService {
    @Override
    public String getString(User user) {
        return "调用失败！";
    }

    @Override
    public String HelloWorld() {
        return "Helloworld 没成功";
    }
}
