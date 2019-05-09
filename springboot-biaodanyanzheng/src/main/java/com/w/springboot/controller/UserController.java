package com.w.springboot.controller;

import javax.validation.Valid;

import com.w.springboot.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	/**
	 *
	 * @return
	 */
	@RequestMapping("toAdd")
	public String toAdd(User user){
		return "add";
	}
	
	/**
	 * 用户添加
	 * @Valid:代表需要对User中的属性验证
	 * BindingResult: 用于封装验证对象（user）里面的验证结果
	 */
	@RequestMapping("add")
	public String add(@Valid User user,BindingResult result){
		//如果存在验证错误
		if(result.hasErrors()){
			//返回add.html
			return "add";

		}
		
		System.out.println("保存用户:"+user);
		return "succ";
	}
}
