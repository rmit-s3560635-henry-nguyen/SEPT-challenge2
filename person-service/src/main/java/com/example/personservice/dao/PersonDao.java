package com.example.personservice.dao;

import com.example.personservice.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;


public interface PersonDao extends JpaRepository<Person, Integer> {

}