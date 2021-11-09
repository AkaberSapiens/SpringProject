package com.sapiens.springDemo.DeclarativeTM.dao;
import com.sapiens.springDemo.DeclarativeTM.model.Employee;

public interface EmployeeDAO {

    public Employee findEmployee(int empId);
    public void insertEmployee(Employee emp);

}
