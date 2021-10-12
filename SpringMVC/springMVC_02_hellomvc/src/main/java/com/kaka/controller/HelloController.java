package com.kaka.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author : kaka
 * @Date: 2021-10-12 10:26
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //ModelAndView 模型和视图
        ModelAndView mv = new ModelAndView();
        //分装对象， 放在ModelAndView中。 Model
        mv.addObject("msg","HelloSpringMVC");
        //分装要跳转的视图  放在ModelAndView中
        mv.setViewName("hello"); //  /WEB-INF/jsp/hello.jsp
        return mv;
    }
}
