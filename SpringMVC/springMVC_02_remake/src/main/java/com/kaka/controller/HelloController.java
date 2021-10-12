package com.kaka.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author : kaka
 * @Date: 2021-10-12 11:18
 */
public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        //业务代码
        String msg = "HelloSpringMVC!";
        mv.addObject("msg", msg);
        //视图跳转
        mv.setViewName("test");

        return mv;
    }
}
