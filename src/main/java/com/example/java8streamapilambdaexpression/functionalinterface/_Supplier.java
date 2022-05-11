package com.example.java8streamapilambdaexpression.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getDBConnectionURL());
        System.out.println(getDBConnectionSupplier.get());
    }

    static String getDBConnectionURL () {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectionSupplier = () ->
            List.of(
                    "jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customer",
                    "jdbc://localhost:5432/employee"
                    );
}
