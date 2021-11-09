package com.sapiens.springDemo.daoSupport.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeClientBean {

    @Autowired
    EmployeeService employeeService;

    public void run(){

        System.out.println("Persisting employee");

        Employee employee = Employee.create("Akaber",30,"development",8000);
        employeeService.saveEmployee(employee);

        Employee employee1 = Employee.create("Hamada",35,"HR",5000);
        employeeService.saveEmployee(employee1);



        List<Employee> allEmployees = employeeService.getAllEmployees();
        System.out.println("Persons Loaded: "+allEmployees);

        employee= employeeService.getEmployeeById(78);
        System.out.println("Person Loaded by id: "+ employee);

        System.out.println("Update the Employee with id 78 ");
        employee.setSalary(10000);
        employeeService.updatePerson(employee);

        System.out.println("Deleting the person");
        employeeService.deleteEmployee(84);

        allEmployees = employeeService.getAllEmployees();
        System.out.println("Employees Loaded: "+allEmployees);
    }
}
