package com.nfdw.test.springboot_mybatis.service.impl;

import com.nfdw.test.springboot_mybatis.entity.Book;
import com.nfdw.test.springboot_mybatis.mapper.BookMapper;
import com.nfdw.test.springboot_mybatis.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hetianxue
 * @Date 2020/3/14
 */
@Service
public class BookServiceImpl implements IBookService {


    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book getById(Integer bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }
}
