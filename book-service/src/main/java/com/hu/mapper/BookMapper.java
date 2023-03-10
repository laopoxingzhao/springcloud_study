package com.hu.mapper;


import com.hu.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {
    @Select("select * from DB_book where bid = #{bid}")
    Book getUserById(int uid);
}
