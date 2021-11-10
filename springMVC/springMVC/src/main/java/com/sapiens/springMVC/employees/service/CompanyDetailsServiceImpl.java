package com.sapiens.springMVC.employees.service;

import com.sapiens.springMVC.employees.model.CompanyDetails;
import com.sapiens.springMVC.employees.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyDetailsServiceImpl implements CompanyDetailsService{
    @Override
    public List<CompanyDetails> findsAll() {

        ArrayList<CompanyDetails> com_details = new ArrayList<CompanyDetails>();

        com_details.add(new CompanyDetails("SAPIENS","development"));
        com_details.add(new CompanyDetails("SAPIENS","HR"));



        return com_details;
    }
}
