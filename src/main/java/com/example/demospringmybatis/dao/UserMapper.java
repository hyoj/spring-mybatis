package com.example.demospringmybatis.dao;

import com.example.demospringmybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE id = #{id}")
    User selectUser(long id);

    User selectUser2(long id);
}
