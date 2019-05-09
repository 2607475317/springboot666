package com.w.mohu.mapper;

import com.w.mohu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> findByName(String username);
}
