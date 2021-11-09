package com.sapiens.springDemo.daoSupport.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonClientBean {

    @Autowired
    PersonService personService;

    public void run(){

        System.out.println("Persisting person");

        Person person = Person.create("Scooby", "doo", "Abc Lane");
        personService.savePerson(person);

        person = Person.create("Oliver", "twist", "xyz Street");
        personService.savePerson(person);

        person = Person.create("Tom", "Cruise", "Florida");
        personService.savePerson(person);

        person = Person.create("david", "beckham", "London");
        personService.savePerson(person);


        List<Person> allPersons = personService.getAllPersons();
        System.out.println("Persons Loaded: "+allPersons);

        person= personService.getPersonById(36);
        System.out.println("Person Loaded by id: "+ person);

        System.out.println("Update the Person with id 36 ");
        person.setAddress("111 yellow hill");
        personService.updatePerson(person);

//        System.out.println("Deleting the person");
//        personService.deletePerson(37);

        allPersons = personService.getAllPersons();
        System.out.println("Persons Loaded: "+allPersons);
    }
}

