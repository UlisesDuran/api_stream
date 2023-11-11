package com.uduran.api.stream.tareas;

import java.util.Arrays;
import java.util.stream.Stream;

public class Tarea33 {
    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
        Stream<String[]> stream = Arrays.stream(lenguajes);
        Stream<String> streamPlano = stream.flatMap(Arrays::stream);
        streamPlano.distinct().forEach(System.out::println);
    }
}
