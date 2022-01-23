package com.github.brunocs1991.calculator.services;

import com.github.brunocs1991.calculator.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    public void delete(String id){}
    public Person updatePerson(Person person){
        return person;
    }

    public Person createPerson(Person person){
        return person;
    }

    public Person findById(String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirtname("Bruno");
        person.setLastName("Costa e Silva");
        person.setAdress("Belo Horizonte - Minas Gerais - Brasil");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll(){
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirtname("Person Name" + i);
        person.setLastName("Last Name" + i);
        person.setAdress("Some adres in Brasil");
        person.setGender("Male");
        return person;
    }
}
