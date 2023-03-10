package com.hu.mapper;


import com.hu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from DB_user where uid = #{uid}")
    User getUserById(int uid);
}
