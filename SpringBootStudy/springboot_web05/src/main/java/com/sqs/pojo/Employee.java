package com.sqs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author : kaka
 * @Date: 2022-08-17 17:11
 * @Description: 员工
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;

    private Department department;
    private Date birth;

    public Employee(Integer id, String lastName, String email, Integer gender, Department department){
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();

    }
}
