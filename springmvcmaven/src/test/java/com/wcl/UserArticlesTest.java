package com.wcl;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wcl.bean.Article;
import com.wcl.dao.UserMapper;

public class UserArticlesTest {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader; 

    static{
        try{
            reader    = Resources.getResourceAsReader("Configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }
    
    public void getUserArticles(int userid){
      SqlSession session = sqlSessionFactory.openSession();
      try {
          UserMapper userOperation=session.getMapper(UserMapper.class);  
          userOperation.selectByPrimaryKey(1);
          /*List<Article> articles = userOperation.getUserArticles(userid);
          for(Article article:articles){
            System.out.println(article.getTitle()+":"+article.getContent()+
                ":作者是:"+article.getUserid()+":地址:"+
                       article.getUserid());
          }*/
      } finally {
          session.close();
      }
    }
    
    public static void main(String[] args) {
        UserArticlesTest testUser=new UserArticlesTest();
      testUser.getUserArticles(1);
  }    
  
}