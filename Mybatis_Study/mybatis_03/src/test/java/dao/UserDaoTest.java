package dao;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
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

   static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();

        for (User user: userList) {
            System.out.println(user);
        }

        //关闭sqlsession
        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info:");
        logger.debug("debug");
        logger.error("error");
    }

    @Test
    public void getUsersByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);

        List<User> userList = mapper.getUsersByLimit(map);

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void rowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //RowBounds分页
        RowBounds rowBounds = new RowBounds(0, 2);

        List<User> list = sqlSession.selectList("dao.UserMapper.rowBounds", null, rowBounds);

        for (User user : list) {
            System.out.println(user);
        }


        sqlSession.close();
    }
}



