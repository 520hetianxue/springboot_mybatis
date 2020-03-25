package com.nfdw.test.springboot_mybatis.entity;

import lombok.Data;

@Data
public class Book {
    private Integer bookId;

    private String sort;

    private String bookName;

    private String writer;

    private String output;

    private Integer price;


}