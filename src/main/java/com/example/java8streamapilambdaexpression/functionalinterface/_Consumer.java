package com.example.java8streamapilambdaexpression.functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "123456789");
        greetCustomer(maria);

        // consumer functional interface
        greetCustomerConsumer.accept(maria);

    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println(
                    "Hello " + customer.getCustomerName() + " Thanks for registering phone number "
                            + customer.getCustomerPhone()
            );

    public static void greetCustomer(Customer customer){
        System.out.println(
                "Hello " + customer.getCustomerName() + " Thanks for registering phone number "
                + customer.getCustomerPhone()
        );
    }


}
