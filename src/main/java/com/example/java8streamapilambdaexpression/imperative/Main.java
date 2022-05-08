package com.example.java8streamapilambdaexpression.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Lina", Gender.FEMALE),
            new Person("Mateo", Gender.MALE),
            new Person("Sandra", Gender.FEMALE),
            new Person("Camilo", Gender.MALE),
            new Person("Alejandra", Gender.FEMALE)
        );

        System.out.println("// Imperative approach");
        // Imperative approach
        List<Person> females = new ArrayList<>();

        for(Person person: people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female: females){
            System.out.println(female);
        }

        System.out.println("// Declarative approach");
        // Declarative approach
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

}