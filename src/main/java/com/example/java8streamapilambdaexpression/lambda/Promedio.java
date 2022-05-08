package com.example.java8streamapilambdaexpression.lambda;

public class Promedio {

    public void calcular(){
        /*Operacion operacion = new Operacion() {

            @Override
            public double calcularPromedio(double n1, double n2) {
                return (n1 + n2) / 2;
            }
        };

        System.out.println(operacion.calcularPromedio(2,3));*/

        Operacion operacion = ((x,y) -> (x+y)/2);
        System.out.println("operación (2,3) = " + operacion.calcularPromedio(2,3));

    }

    public static void main(String[] args) {
        Promedio app = new Promedio();
        app.calcular();
    }
}
