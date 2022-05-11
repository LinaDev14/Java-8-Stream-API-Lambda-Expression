package com.example.java8streamapilambdaexpression.javastreams;

import com.example.java8streamapilambdaexpression.imperative.Gender;

import java.util.List;

public class Streams {

    public static void main(String[] args) {

        List<Person2> people = List.of(
                new Person2("Lina", Gender2.FEMALE),
                new Person2("Mateo", Gender2.MALE),
                new Person2("Camila", Gender2.FEMALE),
                new Person2("Santiago", Gender2.MALE),
                new Person2("Laura", Gender2.FEMALE),
                new Person2("Pablo", Gender2.MALE)

        );
    }

}
