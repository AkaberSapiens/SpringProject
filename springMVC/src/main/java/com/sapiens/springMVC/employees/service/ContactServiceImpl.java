package com.sapiens.springMVC.employees.service;

import com.sapiens.springMVC.employees.model.Contact;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{
    @Override
    public List<Contact> findsAll() {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        contacts.add(new Contact("0465765542","Isreal-Haifa","emp1@gmail.com","www.emp1"));
        contacts.add(new Contact("0543676324","Isreal-Holon","emp2@gmail.com","www.emp2"));
        contacts.add(new Contact("0543214654","Isreal-TelAviv","emp3@gmail.com","www.emp3"));



        return contacts;
    }
}
