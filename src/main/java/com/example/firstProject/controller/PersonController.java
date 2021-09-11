package com.example.firstProject.controller;

import com.example.firstProject.model.Person;
import com.example.firstProject.service.PersonService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person){
        System.out.println(person.getName());
        personService.addPerson(person);
//        return personService.getAll();
    }

    @GetMapping
    public List<Person> index(){
        return personService.getAll();
    }

}
