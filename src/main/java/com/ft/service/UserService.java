package com.ft.service;

import com.ft.dao.UserMapper;
import com.ft.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by poseture on 2017/2/5.
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User login(User user){
        User result = validate(user);
        return user;
    }

    private User validate(User user){
        User result = userMapper.findOne(user);
        return user;
    }
}
