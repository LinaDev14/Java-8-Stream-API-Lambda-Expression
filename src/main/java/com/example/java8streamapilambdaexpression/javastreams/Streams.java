package com.example.java8streamapilambdaexpression.javastreams;

import java.util.List;

import static com.example.java8streamapilambdaexpression.javastreams.Gender2.*;

public class Streams {

    public static void main(String[] args) {

        List<Person2> people = List.of(
                new Person2("Lina", FEMALE),
                new Person2("Mateo", MALE),
                new Person2("Camila", FEMALE),
                new Person2("Santiago", MALE),
                new Person2("Laura", FEMALE),
                new Person2("Pablo", MALE)
        );
    }

}
