package com.example.java8streamapilambdaexpression.functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        // multiply by 10
        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        // combine functions
        Function<Integer, Integer> addBy1AndMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndMultiplyBy10.apply(2));



    }

    /*
    T - the type of the input to the function
    R - the type of the result of the function
    */

    public static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    public static Function<Integer, Integer> multiplyBy10Function = number -> number *10;

    public static int incrementByOne(int number){
        return number + 1;
    }
}
