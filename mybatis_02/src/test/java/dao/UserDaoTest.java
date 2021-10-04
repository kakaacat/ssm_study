package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;

/**
 * @Author : kaka
 * @Date: 2021-09-26 15:54
 */
public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

        for (User user: userList) {
            System.out.println(user);
        }

        //关闭sqlsession
        sqlSession.close();
    }



}



