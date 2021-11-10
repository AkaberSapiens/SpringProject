package com.sapiens.springMVC.employees.service;

import com.sapiens.springMVC.employees.model.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    ArrayList<Employee> employees = new ArrayList<Employee>();

    @Override
    public List<Employee> findsAll() {

        employees.add(new Employee(1,"Akaber",30,"developer","QA"));
        employees.add(new Employee(2,"Lozan",24,"developer","JAVA"));
        employees.add(new Employee(3,"Rima",25,"developer","fullstack"));

        return employees;

    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }


}
