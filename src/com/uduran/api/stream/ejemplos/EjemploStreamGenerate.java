package com.uduran.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamGenerate {
    public static void main(String[] args) {

        AtomicInteger contador = new AtomicInteger(0);
        Stream.generate(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return contador.incrementAndGet();
        })
                .limit(50)
                .forEach(System.out::println);
    }
}