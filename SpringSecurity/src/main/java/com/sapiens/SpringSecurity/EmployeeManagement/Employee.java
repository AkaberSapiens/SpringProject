package com.sapiens.SpringSecurity.EmployeeManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    private long id;
    private String first_name;
    private String last_name;
    private String DOB;
    private String desig;
    private String dept;
    private long years_exp;
    private long salary;

    public Employee() {
    }

    public Employee(long id, String first_name, String last_name, String DOB, String desig, String dept, String years_exp, long salary) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.DOB = DOB;
        this.desig = desig;
        this.dept = dept;
        this.years_exp = years_exp;
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getYears_exp() {
        return years_exp;
    }

    public void setYears_exp(String years_exp) {
        this.years_exp = years_exp;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
