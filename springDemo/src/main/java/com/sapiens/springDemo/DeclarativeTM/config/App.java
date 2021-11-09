package com.sapiens.springDemo.DeclarativeTM.config;

import com.sapiens.springDemo.DeclarativeTM.model.Employee;
import com.sapiens.springDemo.DeclarativeTM.model.EmployeeDetails;
import com.sapiens.springDemo.DeclarativeTM.model.PersonalInfo;
import com.sapiens.springDemo.DeclarativeTM.service.EmployeeService;
import com.sapiens.springDemo.DeclarativeTM.serviceImpl.EmployeeServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeService employeeService = context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);

//        employeeService.getEmployee(230);
        context.registerShutdownHook();
    }

    private static Employee createEmployee() {
        Employee employee = new Employee();
        EmployeeDetails employeeDetails = new EmployeeDetails();
        PersonalInfo personalInfo = new PersonalInfo();

        employee.setId(230);
        employee.setName("Dana");
        employee.setAge(27);
        employee.setSalary(11000);

        employeeDetails.setId(employee.getId());
        employeeDetails.setDeptname("development");
        employeeDetails.setDesignation("Java dev");
        employeeDetails.setQualification("demo");
        employee.setEmployeeDetails(employeeDetails);

        personalInfo.setId(employee.getId());
        personalInfo.setAddress("SD street");
        personalInfo.setContact("03-2223");
        personalInfo.setEmail_ID("demo@example.com");
        employee.setPersonalInfo(personalInfo);

        return employee;
    }
}
