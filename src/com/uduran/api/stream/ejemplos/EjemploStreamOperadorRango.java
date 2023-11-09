package com.uduran.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamOperadorRango {
    public static void main(String[] args) {

        //Map siempre devuelve el resultado cambiado por que es una Function
        IntStream enteros = IntStream.range(1, 200).peek(System.out::println);

        //int resultado = enteros.reduce(0, Integer::sum);
        //int resultado = enteros.sum();
        IntSummaryStatistics stats = enteros.summaryStatistics();
        System.out.println("max = " + stats.getMax());
        System.out.println("min = " + stats.getMin());
        System.out.println("sum = " + stats.getSum());
        System.out.println("Average = " + stats.getAverage());
        System.out.println("Count = " + stats.getCount());
    }
}
