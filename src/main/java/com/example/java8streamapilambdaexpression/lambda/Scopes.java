package com.example.java8streamapilambdaexpression.lambda;

public class Scopes {

    public double probarLocalVariable() {

        final double n3 = 3;
        Op ope = new Op() {

            @Override
            public double calcular(double n1, double n2) {
                return n1 + n2+ n3;
            }
        };

        return ope.calcular(1,1);
    }

    public static void main(String[] args) {
        Scopes app = new Scopes();
        System.out.println(app.probarLocalVariable());
    }
}
