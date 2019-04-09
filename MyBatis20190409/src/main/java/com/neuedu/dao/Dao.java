package com.neuedu.dao;

import com.neuedu.entity.Employees;

import java.util.List;

public interface Dao {
    List<Employees> selectAll();
}
