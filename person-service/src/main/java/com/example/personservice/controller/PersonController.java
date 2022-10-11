package com.example.personservice.controller;

import com.example.personservice.dao.PersonDao;
import com.example.personservice.model.Person;
import com.example.personservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/person")
    public Person addPerson(@RequestBody  Person person) {
        return personService.addPerson(person);
    }

    @GetMapping("/persons/person")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/item/person{id}")
    public Person getPerson(@PathVariable int id) {
        return personService.getPerson(id);
    }

    @PutMapping("/persons/person")
    public Person updatePerson(@RequestBody Person person) {
        return personService.updatePerson(person);
    }

    @DeleteMapping("/persons/person")
    public String deletePerson(@RequestBody Person person) {
        return personService.deletePerson(person);
    }

}
