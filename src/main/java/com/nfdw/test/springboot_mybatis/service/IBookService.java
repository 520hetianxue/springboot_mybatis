package com.nfdw.test.springboot_mybatis.service;

import com.nfdw.test.springboot_mybatis.entity.Book;

/**
 * @author hetianxue
 * @Date 2020/3/14
 */

public interface IBookService {
    Book getById(Integer bookId);
}
