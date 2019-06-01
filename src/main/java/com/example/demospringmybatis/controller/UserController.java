package com.example.demospringmybatis.controller;

import com.example.demospringmybatis.dao.UserMapper;
import com.example.demospringmybatis.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable long id) {
        return userMapper.selectUser(id);
    }

    @GetMapping(value = "/users2/{id}")
    public User getUser2(@PathVariable long id) {
        return userMapper.selectUser2(id);
    }
}
