package com.uduran.api.stream.ejemplos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamOperadorFilterEmpty {
    public static void main(String[] args) {

        long count = Stream
                .of("specter 1234duran", "alex 2010alexis", "Pepa mariana0508", "Pepe gerardoduran042", "", "", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("count = " + count);

    }
}
