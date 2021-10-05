package pojo;

import lombok.Data;

/**
 * @Author : kaka
 * @Date: 2021-10-05 12:57
 */

@Data
public class Student {
    private int id;
    private String name;
    //关联一个老师
    private Teacher teacher;

}
