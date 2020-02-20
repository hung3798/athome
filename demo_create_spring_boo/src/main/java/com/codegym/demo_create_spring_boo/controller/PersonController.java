package com.codegym.demo_create_spring_boo.controller;

import com.codegym.demo_create_spring_boo.entity.Person;
import com.codegym.demo_create_spring_boo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("")
    public ModelAndView getListAll() {
        return new ModelAndView("list", "persons", personService.findAll());
    }

    @GetMapping("/addPerson")
    public ModelAndView addNewPerson() {
        return new ModelAndView("create", "person", new Person());
    }

    @PostMapping("/addPerson")
    public String addPerson(Person person, RedirectAttributes redirect) {
        person.setId((int) (Math.random() * 10000));
        personService.add(person);
        return "redirect:/";
    }

    @GetMapping("/deletePerson")
    public ModelAndView deletePerson() {
        return new ModelAndView("delete","person",new Person());
    }

    @PostMapping("/delete")
    public String deletePerson(@RequestParam int id, RedirectAttributes redirect) {
        personService.remove();
    }
}
