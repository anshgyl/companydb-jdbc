package com.anshgyl.dao.impl;

import com.anshgyl.bean.Department;
import com.anshgyl.bean.Employee;
import com.anshgyl.dao.EmployeeDao;
import com.anshgyl.service.DBConnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public List<Employee> findAllEmployee() {
        String sql = "SELECT * FROM employee";
        ResultSet rs = new DBConnect().executeQuery(sql);
        Employee employee;
        List<Employee> allEmployees = new ArrayList<>();

        try {
            while (rs.next()) {
                employee = new Employee();
                employee.setFname(rs.getString("fname"));
                employee.setMinit(rs.getString("minit").charAt(0));
                employee.setLname(rs.getString("lname"));
                employee.setSsn(rs.getString("ssn"));
                employee.setBdate(rs.getDate("bdate"));
                employee.setAddress(rs.getString("address"));
                employee.setSex(rs.getString("sex").charAt(0));
                employee.setSalary(rs.getFloat("salary"));
                employee.setManager(new Employee(rs.getString("super_ssn")));
                employee.setDepartment(new Department(rs.getInt("dno")));
                allEmployees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }
}
