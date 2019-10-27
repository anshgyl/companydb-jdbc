package com.anshgyl.service.impl;

import com.anshgyl.bean.Employee;
import com.anshgyl.dao.impl.EmployeeDaoImpl;
import com.anshgyl.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void showAllEmployees() {
        List<Employee> allEmployee = new EmployeeDaoImpl().findAllEmployee();
        for (Employee e : allEmployee) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee() {

    }
}
