package com.example.java8streamapilambdaexpression.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Object value = Optional.ofNullable("Hello")
                .orElseThrow(() -> new IllegalArgumentException("exception"))
                //.orElseGet(() -> "default value");
        

        System.out.println(value);
    }
}
