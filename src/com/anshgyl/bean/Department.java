package com.anshgyl.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Department {
    private String dname;
    private Integer dnumber;
    private Date mgr_start_date;
    private DeptLocation location;
    private Set<Project> projects = new HashSet<>();
    private Set<Employee> employees = new HashSet<>();
    private Employee manager;

    public Department() {
    }

    public Department(Integer dnumber) {
        this.dnumber = dnumber;
    }

    public Department(String dname, Integer dnumber, Date mgr_start_date, DeptLocation location, Set<Project> projects, Set<Employee> employees, Employee manager) {
        this.dname = dname;
        this.dnumber = dnumber;
        this.mgr_start_date = mgr_start_date;
        this.location = location;
        this.projects = projects;
        this.employees = employees;
        this.manager = manager;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getDnumber() {
        return dnumber;
    }

    public void setDnumber(Integer dnumber) {
        this.dnumber = dnumber;
    }

    public Date getMgr_start_date() {
        return mgr_start_date;
    }

    public void setMgr_start_date(Date mgr_start_date) {
        this.mgr_start_date = mgr_start_date;
    }

    public DeptLocation getLocation() {
        return location;
    }

    public void setLocation(DeptLocation location) {
        this.location = location;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                ", dnumber=" + dnumber +
                ", mgr_start_date=" + mgr_start_date +
                ", location=" + location +
                ", projects=" + projects +
                ", employees=" + employees +
                ", manager=" + manager +
                '}';
    }
}
