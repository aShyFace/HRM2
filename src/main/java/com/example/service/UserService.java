package com.example.service;

import com.example.bean.User;
import com.example.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能:
 *
 * @author zhi
 * @version 1.0
 * @date 2020-04-23 12:47
 **/
@Service("userService")
public class UserService {
    private UserMapper userMapper;
    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getUsers(){
        return userMapper.selectAll();
    }
}
