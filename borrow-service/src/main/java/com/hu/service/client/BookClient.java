package com.hu.service.client;

import com.hu.entity.Book;
import com.hu.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("bookservice")
public interface BookClient {

    //路径保证和其他微服务提供的一致即可
    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid);  //参数和返回值也保持一致
}