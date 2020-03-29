package com.nfdw.test.springboot_mybatis.controller;

import com.nfdw.test.springboot_mybatis.entity.Book;
import com.nfdw.test.springboot_mybatis.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author hetianxue
 * @Date 2020/3/14
 */

@Controller
@RequestMapping("my")
public class TestController {

    @Autowired
    private IBookService bookService;

    @RequestMapping("springboot")
    @ResponseBody
    public String HelloSpringboot() {
        return "3";
    }

    @RequestMapping("showDate")
    @ResponseBody
    public Date showDate(Date date) {
        System.out.println(date);
        return date;
    }

    @RequestMapping("getById/{bookId}")
    @ResponseBody
    public Book getById(@PathVariable("bookId") Integer bookId) {
        return bookService.getById(bookId);
    }


    @RequestMapping("getById/{bookId}")
    @ResponseBody
    public Book getById1(@PathVariable("bookId") Integer bookId) {
        return bookService.getById(bookId);
    }


    @RequestMapping("getById/{bookId}")
    @ResponseBody
    public Book getById11(@PathVariable("bookId") Integer bookId) {
        return bookService.getById(bookId);
    }

}
