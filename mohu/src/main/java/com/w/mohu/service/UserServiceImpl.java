package com.w.mohu.service;

import com.w.mohu.mapper.UserMapper;
import com.w.mohu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findByName(String username) {
        return userMapper.findByName(username);
    }
}
