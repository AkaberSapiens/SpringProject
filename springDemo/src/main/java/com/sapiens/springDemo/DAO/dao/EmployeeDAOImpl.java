package com.sapiens.springDemo.DAO.dao;
import com.sapiens.springDemo.DAO.model.EmployeeDTO;
import com.sapiens.springDemo.DeclarativeTM.model.Employee;
import org.springframework.stereotype.Repository;


@Repository("employeeDao")

public class EmployeeDAOImpl implements EmployeeDAO{

    public EmployeeDTO createNewEmployee() {

        EmployeeDTO e = new EmployeeDTO();
        e.setId(101);
        e.setFirstName("Akaber");
        e.setLastName("Zalaf");
        e.setAge(30);
        e.setGender("Female");
        e.setDesignation("Developer");
        e.setQualification("Full_Stack");

        return e;
    }



}
