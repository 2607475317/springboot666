package com.w.freeamarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String testController(ModelMap modelMap){
        modelMap.addAttribute("msg","this is freemarker");
        return "freemarker";
    }
}
