package com.hu.service.impl;

import com.hu.entity.User;
import com.hu.mapper.UserMapper;
import com.hu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
