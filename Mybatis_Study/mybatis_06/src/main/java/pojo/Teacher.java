package pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author : kaka
 * @Date: 2021-10-05 12:57
 */

@Data
public class Teacher {
    private int id;
    private String name;

    //一个老师拥有多个学生
    private List<Student> students;
}
