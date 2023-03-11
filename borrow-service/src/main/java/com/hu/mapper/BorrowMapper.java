package com.hu.mapper;

import com.hu.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
public interface BorrowMapper {

    @Select("select * from DB_borrow where uid = #{uid}")
    List<Borrow> getBorrowsByUid(int uid);

    @Select("select * from DB_borrow where bid = #{bid}")
    List<Borrow> getBorrowsByBid(int bid);

    @Select("select * from DB_borrow where bid = #{bid} and uid = #{uid} " )
    List<Borrow> getBorrow(int bid,int uid);
}
