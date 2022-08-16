package com.sqs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : kaka
 * @Date: 2022-08-16 12:27
 */
@Controller
public class testController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg", "hello, springboot!");
        return "test";
    }
}
