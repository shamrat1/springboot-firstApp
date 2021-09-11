package com.example.firstProject.dao;

import com.example.firstProject.model.Person;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("FakePerson")
public class FakePersonDataAccessService implements PersonDAO{
    private  static  List<Person> DB = new ArrayList<>();

    @Override
    public boolean insert(UUID id, Person person) {
        return DB.add(new Person(id,person.getName(),person.getAge()));
    }

    @Override
    public List<Person> viewAll() {
        return DB;
    }

    @Override
    public boolean delete(UUID id) {
//        return DB.stream().remove((element) -> {
//            return element.id == id;
//        });
//        Person person = DB.stream().filter(person1 -> per).findFirst();
    return  false;
    }

    @Override
    public Optional<Person> show(UUID id) {
        return DB.stream().filter(person -> person.getId().equals(id)).findFirst();
    }
}
