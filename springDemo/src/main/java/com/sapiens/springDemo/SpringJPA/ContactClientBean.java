package com.sapiens.springDemo.SpringJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class ContactClientBean {
    @Autowired
    ContactService contactService;
    public void run(){
        System.out.println("Persisting Contact");

        Address address = new Address();
        address.setId(69);
        address.setAddress("ADF23 Street");
        address.setContactNo("0212307");
        address.setEmailID("Luzan@example.com");
        address.setCountry("Japan");

        Insurance insurance = new Insurance();
        insurance.setId(69);
        insurance.setType("Non Life");
        insurance.setValidTill("2030");
        insurance.setPremium(100);

        Contact contact = Contact.create(69, "Luzan", "MM", "09/11/1998","Java dev", address, insurance);
        contactService.insertContact(contact);

        List<Contact> allContacts = contactService.getAllContacts();
        System.out.println("Contacts Loaded: "+allContacts);


        Contact contact = contactService.getContactById(66);
        System.out.println("Contact Loaded by id: "+ contact);

        allContacts = contactService.getByCountry("Israel");
        System.out.println("Contacts Loaded by country : " +allContacts);

        allContacts = contactService.getByPremium(100);
        System.out.println("Contacts Loaded by premium : " +allContacts);

        allContacts = contactService.getByInsuranceType("Life");
        System.out.println("Contacts Loaded by Insurance Type : " +allContacts);

        System.out.println("Update the Contact with id 67 ");
        contact.setDesig("CEO");
        contactService.updateContact(contact);

        System.out.println("Deleting the Contact");
        contactService.deleteContact(67);

        allContacts = contactService.getAllContacts();
        System.out.println("Contacts Loaded: "+allContacts);

    }

}
