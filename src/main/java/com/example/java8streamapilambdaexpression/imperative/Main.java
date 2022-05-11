package com.example.java8streamapilambdaexpression.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.java8streamapilambdaexpression.imperative.Gender.*;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Lina", FEMALE),
            new Person("Mateo", MALE),
            new Person("Sandra", FEMALE),
            new Person("Camilo", MALE),
            new Person("Alejandra", FEMALE)
        );

        System.out.println("// Imperative approach");
        // Imperative approach
        List<Person> females = new ArrayList<>();

        for(Person person: people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female: females){
            System.out.println(female);
        }

        System.out.println("// Declarative approach");
        // Declarative approach
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

}