package com.sapiens.springDemo.ProgramaticTM;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    private JdbcTemplate jdbcTemplate;
    private TransactionTemplate transactionTemplate;

    // setter and getter for TransactionTemplate
    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
    //setter and getter for Jdbc Template
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //create a table
    public void createTable(){
        String query = "CREATE TABLE Employee(ID INT, " +
                "NAME VARCHAR(20), AGE INT, DESIG VARCHAR(50), SALARY INT, CONTACT VARCHAR(20))";
        jdbcTemplate.execute(query);
    }

    //adding an employee

    public void addEmployee(int id, String name, int age, String desig, int salary, String contact){
        String query = "INSERT INTO Employee VALUES("+id+",'"+name+"',"+age+",'"+desig+"',"+salary+",'"+contact+"')";
        jdbcTemplate.execute(query);
    }

    //delete employee
    public void deleteEmployee(int id){
        String query = "DELETE FROM Employee WHERE ID =" +id;
        jdbcTemplate.execute(query);
    }

    //count of data
    public int countEmployee(){
        String query = "select count(*) from Employee";
        return jdbcTemplate.queryForObject(query, Integer.class);
    }

    // extracting the data
    public List<EmployeeAccount> getAllEmployee(){
        String query = "select * from Employee";
        return jdbcTemplate.query(query, new ResultSetExtractor<List<EmployeeAccount>>(){
            @Override
            public List<EmployeeAccount> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<EmployeeAccount> employeeAccounts = new ArrayList<EmployeeAccount>();

                while (rs.next()){
                    EmployeeAccount employeeAccount = new EmployeeAccount();

                    employeeAccount.setId(rs.getInt("id"));
                    employeeAccount.setName(rs.getString("name"));
                    employeeAccount.setAge(rs.getInt("age"));
                    employeeAccount.setDesig(rs.getString("desig"));
                    employeeAccount.setSalary(rs.getInt("salary"));
                    employeeAccount.setContact(rs.getString("contact"));
                    employeeAccounts.add(employeeAccount);
                }
                return employeeAccounts;
            }
        });
    }


    public void depositSalary(int id, int salary){
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                try{
                    getJdbcTemplate().update("update Employee set salary = salary + ? where id =?", salary, id);
                }catch (Exception e){
                    status.isRollbackOnly();
                }
                return null;
            }
        });
    }

    public void updateContactNumber(int id, String contact){
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                try{
                    getJdbcTemplate().update("update Employee set contact = ? where id =?", contact, id);
                }catch (Exception e){
                    status.isRollbackOnly();
                }
                return null;
            }
        });
    }

    public void updateAge(int id, int age){
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                try{
                    getJdbcTemplate().update("update Employee set age =  ? where id =?", age, id);
                }catch (Exception e){
                    status.isRollbackOnly();
                }
                return null;
            }
        });
    }




}
