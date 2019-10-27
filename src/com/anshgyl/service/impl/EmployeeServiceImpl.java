package com.anshgyl.service.impl;

import com.anshgyl.bean.Department;
import com.anshgyl.bean.Employee;
import com.anshgyl.dao.EmployeeDao;
import com.anshgyl.dao.impl.EmployeeDaoImpl;
import com.anshgyl.service.EmployeeService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDaoImpl();

    @Override
    public void showAllEmployees() {
        List<Employee> allEmployee = employeeDao.findAllEmployee();
        for (Employee e : allEmployee) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Employee employee = new Employee();

        System.out.print("First Name: ");
        try {
            employee.setFname(br.readLine());

            System.out.print("Minit: ");
            employee.setMinit(br.readLine().charAt(0));

            System.out.print("Last Name: ");
            employee.setLname(br.readLine());

            System.out.print("SSN: ");
            employee.setSsn(br.readLine());

            System.out.print("Date of Birth (DD/MM/YYYY): ");
            employee.setBdate(new SimpleDateFormat("dd/MM/yyyy").parse(br.readLine()));

            System.out.print("Address: ");
            employee.setAddress(br.readLine());

            System.out.print("Sex: ");
            employee.setSex(br.readLine().charAt(0));

            System.out.print("Salary: ");
            employee.setSalary(Float.parseFloat(br.readLine()));

            System.out.print("Manager SSN: ");
            employee.setManager(new Employee(br.readLine()));

            System.out.print("Department Number: ");
            employee.setDepartment(new Department(Integer.parseInt(br.readLine())));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        employeeDao.saveEmployee(employee);
    }
}
