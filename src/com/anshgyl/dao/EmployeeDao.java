package com.anshgyl.dao;

import com.anshgyl.bean.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAllEmployee();

    void saveEmployee(Employee employee);
}
