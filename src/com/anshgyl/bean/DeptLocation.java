package com.anshgyl.bean;

public class DeptLocation {
    private Department department;
    private String dlocation;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getDlocation() {
        return dlocation;
    }

    public void setDlocation(String dlocation) {
        this.dlocation = dlocation;
    }

    @Override
    public String toString() {
        return "DeptLocation{" +
                "department=" + department +
                ", dlocation='" + dlocation + '\'' +
                '}';
    }
}
