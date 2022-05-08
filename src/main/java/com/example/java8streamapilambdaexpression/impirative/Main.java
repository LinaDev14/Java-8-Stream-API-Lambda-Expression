package com.example.java8streamapilambdaexpression.impirative;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Lina", Gender.MALE),
            new Person("Mateo", Gender.MALE),
            new Person("Sandra", Gender.FEMALE),
            new Person("Camilo", Gender.MALE),
            new Person("Alejandra", Gender.FEMALE)
        );

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
    }

}