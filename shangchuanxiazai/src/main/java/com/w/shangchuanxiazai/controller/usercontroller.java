package com.w.shangchuanxiazai.controller;


import org.springframework.web.bind.annotation.RequestMapping;

public class usercontroller {
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }
}
