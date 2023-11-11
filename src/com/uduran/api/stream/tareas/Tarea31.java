package com.uduran.api.stream.tareas;

import java.util.DoubleSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Tarea31 {
    public static void main(String[] args) {
        OptionalDouble grupo = IntStream.rangeClosed(1, 100).filter(e -> e%10 != 0).mapToDouble(e -> (double)e/2).reduce(Double::sum);
        DoubleSummaryStatistics statGrupo = grupo.stream().summaryStatistics();
        System.out.println(statGrupo.getSum());

    }
}
