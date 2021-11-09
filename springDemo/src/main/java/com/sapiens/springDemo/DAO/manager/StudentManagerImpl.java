package com.sapiens.springDemo.DAO.manager;
import com.sapiens.springDemo.DAO.dao.StudentDAO;
import com.sapiens.springDemo.DAO.model.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentManager")
public class StudentManagerImpl implements StudentManager{

    @Autowired
    StudentDAO dao;

    @Override
    public StudentDTO createNewStudent() {
        return dao.createNewStudent();
    }
}
