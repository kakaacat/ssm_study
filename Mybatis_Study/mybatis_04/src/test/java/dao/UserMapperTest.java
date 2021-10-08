package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.List;

/**
 * @Author : kaka
 * @Date: 2021-10-04 16:42
 */
public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.getUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }

        User user = mapper.getUserByID(1);
        System.out.println(user);

        sqlSession.close();
    }
}
