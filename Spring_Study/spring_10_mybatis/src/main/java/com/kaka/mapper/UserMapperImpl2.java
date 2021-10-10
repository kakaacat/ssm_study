package com.kaka.mapper;

import com.kaka.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author : kaka
 * @Date: 2021-10-10 16:18
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectUser() {
        User user = new User(5, "asdf", "123");

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(5);
        return mapper.selectUser();
    }

    public void addUser(User user) {
        getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public void deleteUser(int id) {
        getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
