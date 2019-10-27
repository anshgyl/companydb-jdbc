package com.anshgyl.bean;

import java.util.HashMap;

public class Project {
    private String pname;
    private Integer pnumber;
    private String plocation;
    private Department department;
    private HashMap<Employee, Float> hours = new HashMap<>();

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPnumber() {
        return pnumber;
    }

    public void setPnumber(Integer pnumber) {
        this.pnumber = pnumber;
    }

    public String getPlocation() {
        return plocation;
    }

    public void setPlocation(String plocation) {
        this.plocation = plocation;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public HashMap<Employee, Float> getHours() {
        return hours;
    }

    public void setHours(HashMap<Employee, Float> hours) {
        this.hours = hours;
    }
}
