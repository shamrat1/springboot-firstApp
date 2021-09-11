package com.example.firstProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import  java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;
    private  final  String age;

    public Person(
            @JsonProperty("id") UUID id,
            @JsonProperty("name")  String name,
            @JsonProperty("age") String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
}
