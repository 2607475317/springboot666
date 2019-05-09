package com.w.springbootmybaits.mapper;

import com.w.springbootmybaits.pojo.TxPerson;

import java.util.List;

public interface TxPersonMapper {
    List<TxPerson> selectPerson();
}
