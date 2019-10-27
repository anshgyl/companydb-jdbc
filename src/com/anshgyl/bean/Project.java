package com.anshgyl.bean;

import java.util.HashMap;

public class Project {
    private String pname;
    private Integer pnumber;
    private String plocation;

    //To map the object fetched from dnum
    private Department department;

    //For mapping Many-to-Many Relationship between Project and Employees, also one extra parameter from works_on (hours)
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

    @Override
    public String toString() {
        return "Project{" +
                "pname='" + pname + '\'' +
                ", pnumber=" + pnumber +
                ", plocation='" + plocation + '\'' +
                ", department=" + department +
                ", hours=" + hours +
                '}';
    }
}
