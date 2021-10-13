package com.kaka.controller;

import com.kaka.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author : kaka
 * @Date: 2021-10-13 15:31
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        //1.接受前端参数
        System.out.println("接受的参数为：" + name);

        //2.将返回的结果返回给前端
        model.addAttribute("msg", name);

        //视图跳转
        return "test";
    }

    //接受的是一个对象
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);

        return "test";
    }

}
