package com.example.personservice.service;

import com.example.personservice.dao.Dao;
import com.example.personservice.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Scope(value = "session")
@Component(value = "personService")
public class PersonService {

    @Autowired
    private Dao<Person> personDao;

    private Person person = new Person();

    public void save() {
        personDao.save(person);
        person = new Person();
    }

    public Collection<Person> getAllPerson() {
        return personDao.getAll();
    }

    public int savePerson(Person person) {
        return personDao.save(person);
    }

    public Person getPerson() {
        return person;
    }
}
