package com.codegym.demo_create_spring_boo.service;

import com.codegym.demo_create_spring_boo.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {
    private static Map<Integer, Person> map = new HashMap<>();
    static {
        map.put(1, new Person(1, "hai", "quang nam"));
        map.put(2, new Person(2, "trung", "thanh hoa"));
        map.put(3, new Person(3, "quang", "nghe an"));
        map.put(4, new Person(4, "nam", "ha tinh"));
    }

    @Override
    public List<Person> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public void add(Person person) {
        map.put(person.getId(), person);
    }

    @Override
    public void remove(int id) {
        map.remove()
    }
}
