package com.kaka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author : kaka
 * @Date: 2021-10-13 15:56
 */
@Controller
public class Encoding {

    @PostMapping("/e/t1")
    public String test1(String name, Model model){
        model.addAttribute("msg", name);
        return "test";
    }
}
