package com.anshgyl.dao.impl;

import com.anshgyl.bean.Department;
import com.anshgyl.bean.Employee;
import com.anshgyl.dao.EmployeeDao;
import com.anshgyl.service.DBConnect;

import java.sql.*;
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
        String sql = "INSERT INTO employee" +
                "(fname,minit,lname,ssn,bdate,address,sex,salary,super_ssn,dno) " +
                "VALUES " +
                "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection connection = new DBConnect().getConnection();
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getFname());
            preparedStatement.setString(2, String.valueOf(employee.getMinit()));
            preparedStatement.setString(3, employee.getLname());
            preparedStatement.setString(4, employee.getSsn());
            preparedStatement.setDate(5, new Date(employee.getBdate().getTime()));
            preparedStatement.setString(6, employee.getAddress());
            preparedStatement.setString(7, String.valueOf(employee.getSex()));
            preparedStatement.setFloat(8, employee.getSalary());
            preparedStatement.setString(9, employee.getManager().getSsn());
            preparedStatement.setInt(10, employee.getDepartment().getDnumber());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
