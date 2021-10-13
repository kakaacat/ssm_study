package com.kaka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : kaka
 * @Date: 2021-10-12 15:42
 */
@Controller
@RequestMapping("/c1")
public class ControllerTest2 {

    @RequestMapping("/test")
    public String test1(Model model){
        model.addAttribute("msg", "Hello,SpringMVC333333333!");
        return "test";    //    WEB-INF/jsp/test.jsp
    }
}
