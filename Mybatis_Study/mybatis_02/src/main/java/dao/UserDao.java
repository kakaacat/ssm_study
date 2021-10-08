package dao;

import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //查询全部用户
    List<User> getUserList();

    //根据ID查用户
    User getUserById(int id);

    //insert一个用户
    void addUser(User user);

    //修改用户
    void updateUser(User user);

    //删除一个用户
    void deleteUser(int id);

}
