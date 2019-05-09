package com.w.poi.mapper;

import com.w.poi.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUsers();

    void updateUserByName(User user);

    void addUser(User user);

    int selectByName(String username);
}
