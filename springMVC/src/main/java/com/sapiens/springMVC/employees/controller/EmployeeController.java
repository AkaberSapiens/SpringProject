package com.sapiens.springMVC.employees.controller;

import com.sapiens.springMVC.employees.model.CompanyDetails;
import com.sapiens.springMVC.employees.model.Contact;
import com.sapiens.springMVC.employees.model.Employee;
import com.sapiens.springMVC.employees.service.CompanyDetailsService;
import com.sapiens.springMVC.employees.service.ContactService;
import com.sapiens.springMVC.employees.service.EmployeeService;
import com.sapiens.springMVC.employees.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ContactService contactService;
    @Autowired
    private CompanyDetailsService companyDetailsService;
    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;


    @GetMapping(value="/employee")
    public List<Employee> getEmployee(){
        List<Employee> employees = employeeService.findsAll();
        return employees;
    }

    @GetMapping(value="/contacts")
    public List<Contact> getContact(){
        List<Contact> contacts = contactService.findsAll();
        return contacts;
    }

    @GetMapping(value="/companyDetails")
    public List<CompanyDetails> getCompanyDetails(){
        List<CompanyDetails> companyDetails = companyDetailsService.findsAll();
        return companyDetails;
    }

    @PostMapping(path = "/employeePost", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
        Integer id = employeeService.findsAll().size() + 1;

        employee.setId(id);

        employeeService.addEmployee(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    }

