package com.sapiens.springDemo.ProgramaticTM;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.util.List;

public class Utility {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\SpringDemo\\springDemo\\springDemo\\src\\main\\resources\\Beans.xml");
        EmployeeDAO employeeDAO = context.getBean("EmployeeDAOBean", EmployeeDAO.class);

        System.out.println("Create a table");
        employeeDAO.createTable();

        System.out.println("Adding Data to Table");
        employeeDAO.addEmployee(1, "Akaber", 30, "development", 8000, "0546543243");
        employeeDAO.addEmployee(2, "Rima", 25, "development", 8000, "0786451");
        employeeDAO.addEmployee(3, "Lozan", 24, "development", 8000, "06453512");
        employeeDAO.addEmployee(4, "Salma", 26, "development", 8000, "075645352");
        employeeDAO.addEmployee(5, "Hamada", 35, "development", 8000, "06453512");
        employeeDAO.addEmployee(6, "Naif", 39, "development", 8000, "06453512");
        employeeDAO.addEmployee(7, "Amir", 30, "development", 8000, "06453512");

        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees = employeeDAO.getAllEmployee();
        for (EmployeeAccount employeeAccount : allEmployees) {
            System.out.println("Employee's ID: " +
                    employeeAccount.getId());
            System.out.println("Employee's Name: " +
                    employeeAccount.getName());
            System.out.println("Employee's age: " +
                    employeeAccount.getAge());
            System.out.println("Employee's desig: " +
                    employeeAccount.getDesig());
            System.out.println("Employee's salary: " +
                    employeeAccount.getSalary());
            System.out.println("Employee's contact: " +
                    employeeAccount.getContact());
        }

        System.out.println("Deposit amount");
        employeeDAO.depositSalary(3, 20000);
        employeeDAO.depositSalary(6, 7000);

        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees2 = employeeDAO.getAllEmployee();
        for (EmployeeAccount employeeAccount : allEmployees2) {
            System.out.println("Employee's ID: " +
                    employeeAccount.getId());
            System.out.println("Employee's Name: " +
                    employeeAccount.getName());
            System.out.println("Employee's age: " +
                    employeeAccount.getAge());
            System.out.println("Employee's desig: " +
                    employeeAccount.getDesig());
            System.out.println("Employee's salary: " +
                    employeeAccount.getSalary());
            System.out.println("Employee's contact: " +
                    employeeAccount.getContact());
        }

        System.out.println("update phone numbers");
        employeeDAO.updateContactNumber(4, "0843234358986");
        employeeDAO.updateContactNumber(7, "044423576241");

        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees3 = employeeDAO.getAllEmployee();
        for (EmployeeAccount employeeAccount : allEmployees3) {
            System.out.println("Employee's ID: " +
                    employeeAccount.getId());
            System.out.println("Employee's Name: " +
                    employeeAccount.getName());
            System.out.println("Employee's age: " +
                    employeeAccount.getAge());
            System.out.println("Employee's desig: " +
                    employeeAccount.getDesig());
            System.out.println("Employee's salary: " +
                    employeeAccount.getSalary());
            System.out.println("Employee's contact: " +
                    employeeAccount.getContact());
        }


        System.out.println("update employee's age");
        employeeDAO.updateAge(2,50 );
        employeeDAO.updateAge(5, 40);

        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees4 = employeeDAO.getAllEmployee();
        for (EmployeeAccount employeeAccount : allEmployees4) {
            System.out.println("Employee's ID: " +
                    employeeAccount.getId());
            System.out.println("Employee's Name: " +
                    employeeAccount.getName());
            System.out.println("Employee's age: " +
                    employeeAccount.getAge());
            System.out.println("Employee's desig: " +
                    employeeAccount.getDesig());
            System.out.println("Employee's salary: " +
                    employeeAccount.getSalary());
            System.out.println("Employee's contact: " +
                    employeeAccount.getContact());
        }

        System.out.println("count the employees before the resignation of the employee ");
        employeeDAO.countEmployee();

        System.out.println("drop an employee");
        employeeDAO.deleteEmployee(1 );

        System.out.println("count the employees after the resignation of the employee");
        employeeDAO.countEmployee();


        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees5 = employeeDAO.getAllEmployee();
        for (EmployeeAccount employeeAccount : allEmployees5) {
            System.out.println("Employee's ID: " +
                    employeeAccount.getId());
            System.out.println("Employee's Name: " +
                    employeeAccount.getName());
            System.out.println("Employee's age: " +
                    employeeAccount.getAge());
            System.out.println("Employee's desig: " +
                    employeeAccount.getDesig());
            System.out.println("Employee's salary: " +
                    employeeAccount.getSalary());
            System.out.println("Employee's contact: " +
                    employeeAccount.getContact());
        }


    }
}
