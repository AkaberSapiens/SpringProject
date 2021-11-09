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
        final String SELECT_BY_ID_QUERY = "select emp.id_emp, name, age,salary, deptname, designation,qualification,address,contact,email_ID from employee emp, employee_details empdet,personal_info perinf"+
                " where emp.id_emp = empdet.id_empdet and emp.id_emp=perinf.id_info and perinf.id_info=?";
        return this.jdbcTemplate.queryForObject(SELECT_BY_ID_QUERY,new EmployeeMapper(), empId);
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

        final String INSERT_EMP_QUERY = "insert into employee(id_emp, name, age,salary)values (?,?,?,?)";
        final String INSERT_DET_QUERY = "insert into employee_details(id_empdet, deptname, designation,qualification) values (?,?,?,?)";
        final String INSERT_INFO_QUERY = "insert into personal_info(id_info, address, contact,email_ID) values (?,?,?,?)";

        jdbcTemplate.update(INSERT_EMP_QUERY, emp.getId(), emp.getName(), emp.getAge(),emp.getSalary());
        System.out.println("Employee inserted Successfully");
        jdbcTemplate.update(INSERT_DET_QUERY,emp.getId(), emp.getEmployeeDetails().getDeptname(),emp.getEmployeeDetails().getDesignation(),emp.getEmployeeDetails().getQualification() );
        System.out.println("Employee details inserted successfully");
        jdbcTemplate.update(INSERT_INFO_QUERY,emp.getId(), emp.getPersonalInfo().getAddress(),emp.getPersonalInfo().getContact(),emp.getPersonalInfo().getEmail_ID());
        System.out.println("Employee details inserted successfully");
    }


}
