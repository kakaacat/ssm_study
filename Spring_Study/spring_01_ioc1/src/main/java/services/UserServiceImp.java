package services;

import dao.UserDao;
import dao.UserDaoImp;

/**
 * @Author : kaka
 * @Date: 2021-10-08 16:58
 */
public class UserServiceImp implements UserService{


    //private UserDao userDao = new UserDaoImp();


    private UserDao userDao;

    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
