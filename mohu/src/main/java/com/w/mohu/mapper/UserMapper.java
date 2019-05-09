package com.w.mohu.mapper;

import com.w.mohu.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> findByName(String username);
    List<User> findByNameAndRole(String username,String role);
}
