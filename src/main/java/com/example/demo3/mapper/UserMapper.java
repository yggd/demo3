package com.example.demo3.mapper;

import com.example.demo3.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT USER_ID AS userId, USER_NAME AS userName FROM USER ORDER BY USER_ID")
    List<User> findUsers();

}
