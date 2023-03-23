package com.hu.service.client.impl;

import com.hu.entity.User;
import com.hu.service.client.UserClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class UserFallBackClient implements UserClient {
    @Override
    public User findUserById(int uid) {
      log.info("aaa");
        return new User();
    }
}
