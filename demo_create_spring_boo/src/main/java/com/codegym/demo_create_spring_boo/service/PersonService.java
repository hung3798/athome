package com.codegym.demo_create_spring_boo.service;

import com.codegym.demo_create_spring_boo.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    void add(Person person);

    void remove(int id);
}
