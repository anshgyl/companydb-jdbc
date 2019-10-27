package com.anshgyl.bean;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Employee {
    private String address;
    private Date bdate;
    private Department department;
    private String fname;
    private String lname;
    private Character minit;
    private Float salary;
    private Character sex;
    private String ssn;
    private Employee manager;
    private Set<Dependent> dependents = new HashSet<>();
    private HashMap<Project, Float> hours = new HashMap<>();

    public Employee() {
    }

    public Employee(String ssn) {
        this.ssn = ssn;
    }

    public Employee(String address, Date bdate, Department department, String fname, String lname, Character minit, Float salary, Character sex, String ssn, Employee manager, Set<Dependent> dependents, HashMap<Project, Float> hours) {
        this.address = address;
        this.bdate = bdate;
        this.department = department;
        this.fname = fname;
        this.lname = lname;
        this.minit = minit;
        this.salary = salary;
        this.sex = sex;
        this.ssn = ssn;
        this.manager = manager;
        this.dependents = dependents;
        this.hours = hours;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Character getMinit() {
        return minit;
    }

    public void setMinit(Character minit) {
        this.minit = minit;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Set<Dependent> getDependents() {
        return dependents;
    }

    public void setDependents(Set<Dependent> dependents) {
        this.dependents = dependents;
    }

    public HashMap<Project, Float> getHours() {
        return hours;
    }

    public void setHours(HashMap<Project, Float> hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address='" + address + '\'' +
                ", bdate=" + bdate +
                ", department=" + department +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", minit=" + minit +
                ", salary=" + salary +
                ", sex=" + sex +
                ", ssn='" + ssn + '\'' +
                ", manager=" + manager +
                ", dependents=" + dependents +
                ", hours=" + hours +
                '}';
    }
}
