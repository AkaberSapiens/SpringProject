package com.sapiens.springDemo.DAO.dao;

import com.sapiens.springDemo.DAO.model.EmployeeDTO;
import com.sapiens.springDemo.DeclarativeTM.model.Employee;

public interface EmployeeDAO {
    public EmployeeDTO createNewEmployee();
    void insertEmployee(Employee emp);
    Employee findEmployee(int empId);
}
