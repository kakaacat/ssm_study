package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

/**
 * @Author : kaka
 * @Date: 2021-10-05 17:28
 */
public class MyTest {

    @Test
    public void queryUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

        //sqlSession.clearCache();//手动请理缓存
        System.out.println("=============");

        User user1 = mapper.queryUserById(1);
        System.out.println(user1);

        System.out.println(user == user1);


        sqlSession.close();
    }

    @Test
    public void queryUserById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();

        System.out.println("=============");

        User user1 = mapper2.queryUserById(1);
        System.out.println(user1);

        System.out.println(user == user1);

        sqlSession2.close();
    }

}
