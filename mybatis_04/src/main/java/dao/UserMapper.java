package dao;

import org.apache.ibatis.annotations.*;
import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //注解
    @Select("select * from user")
    List<User> getUsers();

    @Select("select * from user where id = #{id}")
    User getUserByID(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{id} ")
    int daleteUser(@Param("id") int id);

}
