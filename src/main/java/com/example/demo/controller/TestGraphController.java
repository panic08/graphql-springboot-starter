package com.example.demo.controller;

import com.example.demo.entity.Person;
import org.springframework.graphql.GraphQlResponse;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TestGraphController {

    @QueryMapping
    public Person greeting(@Argument String name, @Argument int age, @Argument String hobby){
        System.out.println("\n\nrequest-> " + name);
        Person person = new Person(name, age, hobby);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getHobby());
        return person;
    }
}
