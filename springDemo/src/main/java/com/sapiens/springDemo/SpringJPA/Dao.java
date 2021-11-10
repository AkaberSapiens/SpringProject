package com.sapiens.springDemo.SpringJPA;

import java.util.List;

public interface Dao {

    void insertContact(Contact con);
    List<Contact> findAll();
    Contact findByContactId(int contact_Id);
    List<Contact> findByCountry(String country);
    List<Contact> findByPremiumAmount(int premium);
    List<Contact> findByInsuranceType(String type);
    void update(Contact contact);
    void delete(int i);

}
