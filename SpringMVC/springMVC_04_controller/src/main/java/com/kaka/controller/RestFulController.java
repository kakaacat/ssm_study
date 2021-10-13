package com.kaka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author : kaka
 * @Date: 2021-10-12 20:00
 */
@Controller
public class RestFulController {

    //原来的：          http://localhost:8080/add?a=1&b=2
    //RestFul风格：    http://localhost:8080/add/1/2

    //@RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET) 也可以
    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model){
        int ret = a + b;
        model.addAttribute("msg", "结果为：" + ret);
        return "test";
    }
}
