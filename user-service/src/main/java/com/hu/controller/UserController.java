package com.hu.controller;

import com.hu.entity.User;
import com.hu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/user/{id}")
    public User  findUserById(@PathVariable("id") int id){

        return userService.getUserById(id);
    }
}


