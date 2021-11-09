package com.sapiens.springDemo.DAO.dao;
import com.sapiens.springDemo.DAO.model.EmployeeDTO;
import com.sapiens.springDemo.DAO.model.StudentDTO;
import com.sapiens.springDemo.DeclarativeTM.model.Employee;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO{

    public StudentDTO createNewStudent() {
        StudentDTO e = new StudentDTO();
        e.setId(101);
        e.setName("Akaber");
        e.setGrade(98);
        e.setPercentage(99);
        return e;
    }

}
