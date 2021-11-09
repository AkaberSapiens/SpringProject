package com.sapiens.springDemo.DeclarativeTM.service;
import com.sapiens.springDemo.DeclarativeTM.model.Employee;

public interface EmployeeService {
    public Employee getEmployee(int empId);
    public void addEmployee(Employee emp);

}
