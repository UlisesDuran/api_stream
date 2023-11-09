package com.uduran.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamOperadorReduceEnteros {
    public static void main(String[] args) {

        //Map siempre devuelve el resultado cambiado por que es una Function
        Stream<Integer> enteros = Stream.of(6, 5, 32, 12, 56, 78, 553);
        int resultado = enteros.reduce(0, Integer::sum);
        System.out.println(resultado);
    }
}
