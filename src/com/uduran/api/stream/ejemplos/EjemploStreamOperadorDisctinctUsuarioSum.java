package com.uduran.api.stream.ejemplos;

import com.uduran.api.stream.ejemplos.modelos.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamOperadorDisctinctUsuarioSum {
    public static void main(String[] args) {

        IntStream largoUsuarios = Stream
                .of("specter 1234duran", "specter 1234duran", "specter 1234duran", "alex 2010alexis", "Pepa mariana0508", "Pepe gerardoduran042")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length());

        IntSummaryStatistics stats = largoUsuarios.summaryStatistics();
        //largoUsuarios.forEach(System.out::println);
        System.out.println(stats.getMax());
        System.out.println(stats.getSum());
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
    }
}
