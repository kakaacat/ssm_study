package dao;

import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //模糊查询
    List<User> getUserLike(String value);


    //查询全部用户
    List<User> getUserList();

    //根据ID查用户
    User getUserById(int id);
    //Map
    User getUserById2(Map<String, Object> map);

    //insert一个用户
    void addUser(User user);
    //万能Map
    // 传递map的key..
    // 实体类或数据表\字段或者参数过多, 可以考虑使用Map
    void addUser2(Map<String, Object> map);

    //修改用户
    void updateUser(User user);

    //删除一个用户
    void deleteUser(int id);

}
