package com.neuedu.dao;

import com.neuedu.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Dao {
    @Select("select * from employees")
    public List<User> selectall();
}
