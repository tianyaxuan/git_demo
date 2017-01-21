package com.wcl;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wcl.bean.Dog;
import com.wcl.dao.DogMapper;

public class Test {
    private static SqlSessionFactory sqlSessionFactory;

    private static Reader reader;
    static {
        try {
            reader = Resources.getResourceAsReader("Configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession() {
        return sqlSessionFactory;
    }

 /*   public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Dog user = (Dog) session.selectOne("com.util.common.interf.DogMapper.selectByPrimaryKey", 21);
            System.out.println(user.getName());
            System.out.println(user.getColor());
        } finally {
            session.close();
        }
    }*/
    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            DogMapper userOperation=session.getMapper(DogMapper.class);
            Dog user = userOperation.selectByPrimaryKey(21);
            System.out.println(user.getName());
            System.out.println(user.getColor());
        } finally {
            session.close();
        }
    }
}
