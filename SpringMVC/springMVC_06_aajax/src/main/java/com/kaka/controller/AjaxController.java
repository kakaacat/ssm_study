package com.kaka.controller;

import com.kaka.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author : kaka
 * @Date: 2021-10-19 15:24
 */
@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String t1(){

        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        if("kaka".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> userList = new ArrayList<User>();

        userList.add(new User("kaka1",1,"man"));
        userList.add(new User("kaka2",2,"man"));
        userList.add(new User("kaka3",3,"man"));

        return userList;
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd) {
        String msg = "";
        if (name != null) {
            //admin应该从数据库中取得
            if ("admiin".equals(name)) {
                msg = "ok";
            } else {
                msg = "fail";
            }
        }
        if (pwd != null) {
            //admin应该从数据库中取得
            if ("123456".equals(pwd)) {
                msg = "ok";
            } else {
                msg = "fail";
            }
        }

        return msg;
    }

}
