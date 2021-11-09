package com.sapiens.springDemo.DeclarativeTM.config;

import com.sapiens.springDemo.DeclarativeTM.service.EmployeeService;
import com.sapiens.springDemo.DeclarativeTM.serviceImpl.EmployeeServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeService employeeService = context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
    }
}
