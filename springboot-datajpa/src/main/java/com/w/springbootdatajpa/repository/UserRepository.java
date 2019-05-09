package com.w.springbootdatajpa.repository;


import com.w.springbootdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

//继承JpaRepository来完成对数据库的操作
//继承JpaSpecificationExecutor接口完成组合查询
public interface UserRepository extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User> {
}
