package com.sapiens.springDemo.DAO.controller;
import com.sapiens.springDemo.DAO.manager.StudentManager;
import com.sapiens.springDemo.DAO.model.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("studentController")
public class StudentController {

    @Autowired
    StudentManager manager;

    public StudentDTO createNewStudent(){
        return manager.createNewStudent();
    }
}
