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
        address.setId(70);
        address.setAddress("Haifa city");
        address.setContactNo("0764438");
        address.setEmailID("Akaber@example.com");
        address.setCountry("Isreal");

        Insurance insurance = new Insurance();
        insurance.setId(70);
        insurance.setType("Non Life");
        insurance.setValidTill("2030");
        insurance.setPremium(300);

        Contact contact = Contact.create(70, "Akaber", "AZ", "13/05/1991","QA", address, insurance);
        contactService.insertContact(contact);

        List<Contact> allContacts = contactService.getAllContacts();
        System.out.println("Contacts Loaded: "+allContacts);


        Contact contact1 = contactService.getContactById(66);
        System.out.println("Contact Loaded by id: "+ contact1);

        allContacts = contactService.getByCountry("Israel");
        System.out.println("Contacts Loaded by country : " +allContacts);

        allContacts = contactService.getByPremium(100);
        System.out.println("Contacts Loaded by premium : " +allContacts);

        allContacts = contactService.getByInsuranceType("Life");
        System.out.println("Contacts Loaded by Insurance Type : " +allContacts);

        System.out.println("Update the Contact with id 67 ");
        contact.setDesig("CEO");
        contactService.updateContact(contact);

//        System.out.println("Deleting the Contact");
//        contactService.deleteContact(67);

        allContacts = contactService.getAllContacts();
        System.out.println("Contacts Loaded: "+allContacts);

    }

}
