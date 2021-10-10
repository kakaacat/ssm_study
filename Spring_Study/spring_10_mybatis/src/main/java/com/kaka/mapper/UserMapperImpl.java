package com.kaka.mapper;

import com.kaka.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @Author : kaka
 * @Date: 2021-10-10 15:56
 */
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }

    public void addUser(User user) {

    }

    public void deleteUser(int id) {

    }
}
