package com.sqs.dao;

import com.sqs.pojo.Department;
import com.sqs.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author : kaka
 * @Date: 2022-08-17 17:21
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;
    static {
        employees = new HashMap<>();

        employees.put(1001, new Employee(1001, "a","a@qq.com", 0, new Department(101, "数学部")));
        employees.put(1002, new Employee(1002, "b","b@qq.com", 1, new Department(102, "市场部")));
        employees.put(1003, new Employee(1003, "c","c@qq.com", 0, new Department(103, "教研部")));
        employees.put(1004, new Employee(1004, "d","d@qq.com", 1, new Department(104, "运营部")));
        employees.put(1005, new Employee(1005, "e","e@qq.com", 0, new Department(105, "财务部")));
    }
    private static Integer initId = 1006;

    public void save(Employee employee){
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }
    public Collection<Employee> getEmployees(){
        return employees.values();
    }
    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }
    public void delete(Integer id) {
        employees.remove(id);
    }
}
