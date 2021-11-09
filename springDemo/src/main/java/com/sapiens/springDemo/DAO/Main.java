package com.sapiens.springDemo.DAO;
import com.sapiens.springDemo.DAO.manager.EmployeeManagerImpl;
import com.sapiens.springDemo.DAO.manager.StudentManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeManagerImpl manager1 = context.getBean(EmployeeManagerImpl.class);
        System.out.println(manager1.createNewEmployee());
        StudentManagerImpl manager2 = context.getBean(StudentManagerImpl.class);
        System.out.println(manager2.createNewStudent());

    }
}
