package com.sapiens.springMVC.employees.service;

import com.sapiens.springMVC.employees.model.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> findsAll();
    void addEmployee(Employee employee);
}
