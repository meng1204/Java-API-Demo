package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Defined as RestFul API
 */
@RequestMapping("/api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    /*
        Constructor-based dependency injection
     */
    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    /**
     * Post request to add person
     * RequestBody
     * @param person
     */
    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }
}
