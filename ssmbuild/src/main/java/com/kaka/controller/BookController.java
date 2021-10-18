package com.kaka.controller;

import com.kaka.pojo.Books;
import com.kaka.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author : kaka
 * @Date: 2021-10-14 17:23
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调 service层
    @Autowired  //自动装配
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部数据，并返回给前端页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }
}
