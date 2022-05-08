package com.example.java8streamapilambdaexpression.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _BiConsumer {
    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "123456789");

        greetCustomerConsumer2.accept(maria, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumer2 = (customer, showPhoneNumber) ->
            System.out.println(
                    "Hello " + customer.getCustomerName() + " Thanks for registering phone number "
                            + (showPhoneNumber ? customer.getCustomerPhone() : "**********")
            );
}
