package com.w.mohu.service;

import com.w.mohu.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findByName(String username);
}
