package com.example.java8streamapilambdaexpression.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(
                isPhoneNumberValid("07098780987")
        );
        System.out.println(
                isPhoneNumberValid("90963738392333")
        );

        System.out.println("With Predicate");
        System.out.println(
                isPhoneNumberValidPredicate.test("07098780987")
        );
        System.out.println(
                isPhoneNumberValidPredicate.test("90963738392333")
        );

        // Is phone number valid and contains number 3?
        System.out.println(
                "Is phone number valid and contains number 3? " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("90963738392333")
        );
        //Is phone number valid or contains number 3?
        System.out.println(
                "Is phone number valid or contains number 3? " +
                isPhoneNumberValidPredicate.or(containsNumber3).test("07030000000")
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
