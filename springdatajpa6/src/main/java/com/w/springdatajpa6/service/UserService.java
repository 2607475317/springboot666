package com.w.springdatajpa6.service;


import com.w.springdatajpa6.domain.User;

import java.util.List;

public interface UserService {
    public List<User> getUserList();
    //根据id找
    public User findUserById(long id);
    public void save(User user);
    public void edit(User user);
    //根据id删除
    public void delete(long id);
}
