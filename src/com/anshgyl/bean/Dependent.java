package com.anshgyl.bean;

import java.util.Date;

public class Dependent {
    private Employee employee;
    private String dependent_name;
    private Character sex;
    private Date date;
    private String relationship;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getDependent_name() {
        return dependent_name;
    }

    public void setDependent_name(String dependent_name) {
        this.dependent_name = dependent_name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "Dependent{" +
                "employee=" + employee +
                ", dependent_name='" + dependent_name + '\'' +
                ", sex=" + sex +
                ", date=" + date +
                ", relationship='" + relationship + '\'' +
                '}';
    }
}
