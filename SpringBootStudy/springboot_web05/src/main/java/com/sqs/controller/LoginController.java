package com.sqs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

/**
 * @Author : kaka
 * @Date: 2022-08-18 15:28
 */
@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String userName,
                        @RequestParam("password") String password,
                        Model model) {
        if (!StringUtils.isEmpty(userName) && "123".equals(password)) {
            return "dashboard";
        } else {
            model.addAttribute("msg", "用户名或密码错误！");
            return "index";
        }
    }
}