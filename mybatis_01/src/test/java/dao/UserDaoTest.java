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
        //第一步：获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式一：执行sql
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

        //方式二:老方法
       // List<User> userList = sqlSession.selectList("dao.UserDao.getUserList");

        for (User user: userList) {
            System.out.println(user);
        }

        //关闭sqlsession
        sqlSession.close();
    }

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserLike("%李%");
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }


    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUserById(1);

        System.out.println(user);


        sqlSession.close();
    }
    //map
    @Test
    public void getUserById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 1);

        mapper.getUserById2(map);

        sqlSession.close();
    }


    //增删改需要提交事务
    @Test
    public void addUse(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.addUser(new User(4, "李3", "123"));

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    //map
    @Test
    public void addUse2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 4);
        map.put("userName", "ee");
        map.put("userPwd", 123);

        mapper.addUser2(map);

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    //更新
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.updateUser(new User(4, "李2", "111"));

        sqlSession.commit();
        sqlSession.close();
    }

    //删除
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        mapper.deleteUser(4);

        sqlSession.commit();
        sqlSession.close();
    }

}



