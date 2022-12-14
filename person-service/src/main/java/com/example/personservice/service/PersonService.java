package com.example.personservice.service;

import com.example.personservice.dao.PersonDao;
import com.example.personservice.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonDao dao;

    public Person addPerson(Person person) {

        dao.save(person);
        return person;
    }

    public Person getPerson(int id) {
        return dao.findById(id).get();
    }

    public List<Person> getAllPersons() {
        return dao.findAll();
    }

    public Person updatePerson(Person person) {
        dao.save(person);
        return person;
    }

    public String deletePerson(Person person) {
        dao.delete(person);
        return "Person deleted successfully";
    }

    public String deleteAllPersons() {
        dao.deleteAll();
        return "All persons deleted successfully";
    }

}
