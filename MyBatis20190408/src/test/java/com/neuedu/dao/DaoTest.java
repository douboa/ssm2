package com.neuedu.dao;

import com.neuedu.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class DaoTest  {

    @Test
    public void selectall() throws IOException {
        String resource = "mybatis-config.xml";//mybatis-config.xml路径
        InputStream inputStream = Resources.getResourceAsStream(resource);//输入流
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Dao dao = sqlSession.getMapper(Dao.class);
        List<User> listo=dao.selectall();
        System.out.println(listo);
    }
}