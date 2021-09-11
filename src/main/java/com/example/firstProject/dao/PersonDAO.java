package com.example.firstProject.dao;

import com.example.firstProject.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDAO {

    boolean insert(UUID id, Person person);

    default boolean insert(Person person) {
        UUID id = UUID.randomUUID();
        return insert(id,person);
    }

    List<Person> viewAll();

    boolean delete(UUID id);

    Optional<Person> show(UUID id);

}
