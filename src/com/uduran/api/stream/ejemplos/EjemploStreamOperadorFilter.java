package com.uduran.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamOperadorMap {
    public static void main(String[] args) {

        //Map siempre devuelve el resultado cambiado por que es una Function
        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe")
                //.peek(System.out::println)
                .map(String::toUpperCase)
                //.peek(System.out::println)
                .map(String::toLowerCase);
        //nombres.forEach(System.out::println);

        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

    }
}
