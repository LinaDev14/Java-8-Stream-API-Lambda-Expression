package com.example.java8streamapilambdaexpression.lambda;

public class Sintaxis {

    public double probarSintaxis(){
        Operacion operacion = (double x, double y) -> {
            return (x + y) / 2;
        };

        return operacion.calcularPromedio(2,3);
    }

    public static void main(String[] args) {
        Sintaxis app = new Sintaxis();
        System.out.println(app.probarSintaxis());
    }
}
