package com.w.mohu.controller;


import com.w.mohu.mapper.UserMapper;
import com.w.mohu.pojo.User;
import com.w.mohu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;
//    @RequestMapping("/findByName")
//     public String findByName(
//            @RequestParam(defaultValue="1") Integer currentPage,
//            HttpServletRequest request, Model model) {
//      String username=request.getParameter("search");
//      System.out.println(username);
//      //设置当前页和显示数
//      PageHelper.startPage(currentPage,8);
//      List<User> list=userService.findByName(username);
//      //封装查询结果
//      PageInfo<User> pageInfo=new PageInfo<User>(list,8);
//      model.addAttribute("user",pageInfo);
//      return "userinfo";

    @RequestMapping("/index")
    @ResponseBody
    public List<User> index(String username){
        List<User> name = userService.findByName(username);
        return name;
    }

    @RequestMapping("/a")
    @ResponseBody
    public List<User> a(String username,String role){
        List<User> list = userMapper.findByNameAndRole(username, role);
        return list;
    }

}
