package com.w.springbootmybaits.controller;

import com.w.springbootmybaits.mapper.TxPersonMapper;
import com.w.springbootmybaits.pojo.TxPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class indexController {
    @Autowired
    TxPersonMapper txPersonMapper;

    @RequestMapping("/index")
    @ResponseBody
    public List<TxPerson> index(){
        List<TxPerson> txPeople = txPersonMapper.selectPerson();
        return txPeople;
    }
}
