package com.anshgyl;

import com.anshgyl.service.EmployeeService;
import com.anshgyl.service.impl.EmployeeServiceImpl;

public class Main {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.addEmployee();
        employeeService.showAllEmployees();
    }
}
