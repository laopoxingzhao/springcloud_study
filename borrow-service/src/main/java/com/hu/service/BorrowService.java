package com.hu.service;

import com.hu.entity.UserBorrowDetail;
import org.springframework.stereotype.Service;

public interface BorrowService {

    UserBorrowDetail getBorrowDetailByUid(int uid);
}
