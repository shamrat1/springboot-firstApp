package com.example.firstProject.service;

import com.example.firstProject.dao.PersonDAO;
import com.example.firstProject.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("FakePerson") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public boolean addPerson(Person person){
        return personDAO.insert(person);
    }

    public List<Person> getAll(){
        return personDAO.viewAll();
    }

}
