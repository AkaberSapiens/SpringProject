package com.sapiens.springDemo.DAO.controller;
import com.sapiens.springDemo.DAO.manager.EmployeeManager;
import com.sapiens.springDemo.DAO.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller("employeeController")
public class EmployeeController {
    @Autowired
    EmployeeManager manager;

    public EmployeeDTO createNewEmployee(){
        return manager.createNewEmployee();
    }
}



