package com.hu.controller;

import com.hu.entity.Book;
import com.hu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService service;

    @RequestMapping("book/{id}")
    Book findBookById(@PathVariable("id") int bid){
        return service.getBookById(bid);
    }
}


