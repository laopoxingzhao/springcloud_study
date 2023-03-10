package com.hu.service.impl;

import com.hu.entity.Book;

import com.hu.mapper.BookMapper;
import com.hu.service.BookService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper mapper;

    @Override
    public Book getBookById(int id) {
        return mapper.getUserById(id);
    }
}
