package com.example.personservice.dao;

import com.example.personservice.model.Person;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class PersonDao implements Dao<Person> {

    private List<Person> persons = new ArrayList<>();

    @Override
    public Optional<Person> get(int id) {
        return Optional.ofNullable(persons.get(id));
    }

    @Override
    public Collection<Person> getAll() {
        return persons.stream().filter(Objects::nonNull).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }

    @Override
    public int save(Person person) {
        persons.add(person);
        int index = persons.size() - 1;
        person.setId(index);
        return index;
    }

    @Override
    public void update(Person person) {
        persons.set(person.getId(), person);

    }

    @Override
    public void delete(Person person) {
        persons.set(person.getId(), null);
    }


}
