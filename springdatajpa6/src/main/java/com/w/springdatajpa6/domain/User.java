package com.w.springdatajpa6.domain;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")//指定和数据库的哪个表对应
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键自增属性
    private long id;
    @Column
    private String userName;
    @Column
    private String password;
    @Column
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
