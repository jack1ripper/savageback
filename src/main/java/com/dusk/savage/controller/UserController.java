package com.dusk.savage.controller;

import com.dusk.savage.entity.User;
import com.dusk.savage.mapper.UserMapper;
import com.dusk.savage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public Integer save(@RequestBody User user) {
        return userMapper.insert(user);
    }

    @GetMapping
    public List<User> index() {
        return userMapper.findAll();
    }
}
