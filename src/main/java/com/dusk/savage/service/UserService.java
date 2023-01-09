package com.dusk.savage.service;

import com.dusk.savage.entity.User;
import com.dusk.savage.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int save(User user) {
//        if (user.getId() == null) {
//
//        } else {
//            return userMapper.update(user);
//        }
        return userMapper.insert(user);
    }
}

