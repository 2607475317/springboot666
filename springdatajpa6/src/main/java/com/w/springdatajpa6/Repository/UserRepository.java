package com.w.springdatajpa6.Repository;


import com.w.springdatajpa6.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    //根据id查找
    User findById(long id);
    //根据id删除
    void deleteById(Long id);
}
