package com.sapiens.springDemo.DeclarativeTM.model;

public class EmployeeDetails {

    private int id;
    private String deptname;
    private String designation;
    private  String qualification;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", deptname='" + deptname + '\'' +
                ", designation='" + designation + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
