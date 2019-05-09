package com.w.springdatajpa6.service;


import com.w.springdatajpa6.Repository.UserRepository;
import com.w.springdatajpa6.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }
    //根据id找
    @Override
    public User findUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
       userRepository.save(user);
    }

    @Override
    public void edit(User user) {
       userRepository.save(user);
    }
    //根据Id删除
    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }
}
