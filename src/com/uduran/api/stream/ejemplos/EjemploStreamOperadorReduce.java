package com.uduran.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamOperadorReduce {
    public static void main(String[] args) {

        //Map siempre devuelve el resultado cambiado por que es una Function
        Stream<String> usuarios = Stream.of("specter 1234duran", "alex 2010alexis", "Pepa mariana0508", "Pepe gerardoduran042",
                "Pepe gerardoduran042", "Pepe gerardoduran042", "Pepe gerardoduran042")
                .distinct();
        String resultado = usuarios.reduce("resultado =", (a, b) -> a+ ", " + b);
        System.out.println(resultado);
    }
}
