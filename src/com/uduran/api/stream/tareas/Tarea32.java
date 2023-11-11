package com.uduran.api.stream.tareas;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Tarea32 {
    public static void main(String[] args) {
        Function<Integer[], Integer> max = arr -> Arrays.stream(arr).reduce(0, (a, b) -> a > b? a: b);

        int resultado = max.apply(new Integer[]{25, 24, 1025, 65, 89, 45, 10, 23, 89});
        System.out.println(resultado);

    }
}
