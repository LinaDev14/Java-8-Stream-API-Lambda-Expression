package com.example.java8streamapilambdaexpression.javastreams;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.example.java8streamapilambdaexpression.javastreams.Gender2.*;

public class Streams {

    public static void main(String[] args) {

        List<Person2> people = List.of(
                new Person2("Lina", FEMALE),
                new Person2("Mateo", MALE),
                new Person2("Camila", FEMALE),
                new Person2("Santiago", MALE),
                new Person2("Laura", FEMALE),
                new Person2("Pablo", MALE),
                new Person2("Sakary", PREFER_NOT_TO_SAY),
                new Person2("Bertha", PREFER_NOT_TO_SAY)
        );

        //map (GENDERS)
        people.stream()
                .map(Person2::getGender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(Person2::getName)
                .mapToInt(String::length)
                .forEach(System.out::println);

        // sorted
        people.stream()
                .sorted((x1, x2)-> x1.getName()
                        .compareTo(x2.getName()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // AllMatch
        boolean containsOnlyFemales =
        people.stream()
                .allMatch(person2 -> FEMALE.equals(person2.getGender()));
        System.out.println(containsOnlyFemales);

        // AnyMatch
        Predicate<Person2> person2Predicate = person2 ->  FEMALE.equals(person2.getGender());
        boolean containsOnlyFemales1 =
                people.stream()
                        .anyMatch(person2Predicate);
        System.out.println(containsOnlyFemales1);
    }

}
