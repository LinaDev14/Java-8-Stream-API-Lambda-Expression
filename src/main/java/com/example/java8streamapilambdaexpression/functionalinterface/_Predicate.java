package com.example.java8streamapilambdaexpression.functionalinterface;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(
                isPhoneNumberValid("07098780987")
        );
        System.out.println(
                isPhoneNumberValid("90963738392333")
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
