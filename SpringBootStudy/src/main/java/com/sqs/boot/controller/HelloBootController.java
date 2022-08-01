package com.sqs.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : kaka
 * @Date: 2022-08-01 19:31
 */

//@Controller
@RestController
public class HelloBootController {

    //@ResponseBody
    @RequestMapping("/hello")
    public String helloBoot() {
        return "Hello SpringBoot2 !";
    }
}
