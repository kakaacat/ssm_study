package com.kaka.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.kaka.pojo.User;
import com.kaka.util.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @Author : kaka
 * @Date: 2021-10-13 16:48
 */
//@Controller
@RestController //就不用写 @ResponseBody
public class UserController {

    //@RequestMapping(value = "/j1",produces = "application/json;charset=utf-8") 或在MVC配置文件中配置
    @RequestMapping("/j1")
    //@ResponseBody   //就不会走视图解析器，直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //json    ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("kaka", 123, "男");

        String string = mapper.writeValueAsString(user);
        return string;
    }



    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {


        List<User> userList = new ArrayList<User>();

        User user1 = new User("kaka1", 123, "男");
        User user2 = new User("kaka2", 123, "男");
        User user3 = new User("kaka3", 123, "男");
        User user4 = new User("kaka4", 123, "男");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        return JsonUtil.getJson(userList);
    }


    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        Date date = new Date();

        return JsonUtil.getJson(date);
    }

    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();

        User user1 = new User("kaka1", 123, "男");
        User user2 = new User("kaka2", 123, "男");
        User user3 = new User("kaka3", 123, "男");
        User user4 = new User("kaka4", 123, "男");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        System.out.println("-------java对象  转  JSON字符串------");
        String string1 = JSON.toJSONString(userList);
        System.out.println("JSON.toJSONString(userList)===>" + string1);

        System.out.println("-------JSON字符串  转  java对象------");
        String str1 = JSON.toJSONString(user1);
        User parseObject = JSON.parseObject(str1, User.class);
        System.out.println("JSON.parseObject(str1, User.class)===>" + parseObject);

        System.out.println("-------java对象  转  JSON对象------");
        JSONObject toJSON = (JSONObject) JSON.toJSON(user1);
        System.out.println("JSON.toJSON(user1)===> " + toJSON);

        System.out.println("-------JSON对象  转  Java对象------");
        User toJavaObject = JSON.toJavaObject(toJSON, User.class);
        System.out.println("JSON.toJavaObject(toJSON, User.class)===> " + toJavaObject);


        return JSON.toJSONString(userList);
    }
}
