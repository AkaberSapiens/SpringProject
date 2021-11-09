package com.sapiens.springDemo.DeclarativeTM.daoImpl;
import com.sapiens.springDemo.DeclarativeTM.dao.EmployeeDAO;
import com.sapiens.springDemo.DeclarativeTM.model.Employee;
import com.sapiens.springDemo.DeclarativeTM.model.EmployeeDetails;
import com.sapiens.springDemo.DeclarativeTM.model.PersonalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Employee findEmployee(int empId) {
        final String SELECT_BY_ID_QUERY = "select emp.id, name, age, address, city from employee emp, address adr"+
        "where emp.id = adr.id and emp.id = ?";
        return
            this.jdbcTemplate.queryForObject(SELECT_BY_ID_QUERY,new EmployeeMapper(), empId);
    }

    private static final class EmployeeMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee emp = new Employee();
            EmployeeDetails employeeDetails = new EmployeeDetails();
            PersonalInfo personalInfo = new PersonalInfo();

            emp.setId(rs.getInt("id_emp"));
            emp.setName(rs.getString("name"));
            emp.setAge(rs.getInt("age"));
            emp.setSalary(rs.getInt("salary"));

            employeeDetails.setDeptname("deptname");
            employeeDetails.setDesignation("designation");
            employeeDetails.setQualification("qualification");

            personalInfo.setAddress("address");
            personalInfo.setContact("contact");
            personalInfo.setEmail_ID("email_ID");

            emp.setEmployeeDetails(employeeDetails);
            emp.setPersonalInfo(personalInfo);

            return emp;
        }
    }


    @Override
    public void insertEmployee(Employee emp) {
        final String INSERT_EMP_QUERY = "insert into employee(id, name, age)values (?,?,?)";
        final String INSERT_ADDR_QUERY = "insert into address(id, address, city) values (?,?,?)";
        jdbcTemplate.update(INSERT_EMP_QUERY, emp.getEmpid(), emp.getEmpName(), emp.getAge());
        System.out.println("Employee inserted Successfully");
        jdbcTemplate.update(INSERT_ADDR_QUERY,emp.getEmpid(), emp.getAddress().getAddress(), emp.getAddress().getCity());
        System.out.println("Address inserted successfully");
    }


}
