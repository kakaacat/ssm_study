package demo2;

/**
 * @Author : kaka
 * @Date: 2021-10-09 19:23
 */
public class Proxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //增加了需求
    public void log(String msg){
        System.out.println("[Debug]使用了" + msg + "方法。");
    }
}
