package com.kaka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : kaka
 * @Date: 2021-10-12 15:32
 */
@Controller  //代表这个类会被spring接管
public class ControllerTest {

    @RequestMapping("/test")
    public String test1(Model model){
        model.addAttribute("msg", "Hello,SpringMVC!");
        return "test";    //    WEB-INF/jsp/test.jsp
    }
}
