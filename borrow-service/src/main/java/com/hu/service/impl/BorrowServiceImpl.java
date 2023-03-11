package com.hu.service.impl;

import com.hu.entity.Book;
import com.hu.entity.Borrow;
import com.hu.entity.User;
import com.hu.entity.UserBorrowDetail;
import com.hu.mapper.BorrowMapper;
import com.hu.service.BorrowService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    BorrowMapper mapper;
    @Override
    public UserBorrowDetail getBorrowDetailByUid(int uid) {
        List<Borrow> borrows = mapper.getBorrowsByUid(uid);
        RestTemplate template = new RestTemplate();
        User user = template.getForObject("http://localhost:8083/user/"+ uid,User.class);

        List<Book> books = borrows
                .stream()
                .map(
                borrow -> template.getForObject("http://localhost:8081/book/" + borrow.getBid(),
                        Book.class))
                .collect(Collectors.toList());

        return new UserBorrowDetail(user,books);
    }
}
