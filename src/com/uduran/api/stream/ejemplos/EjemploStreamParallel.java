package com.uduran.api.stream.ejemplos;

import com.uduran.api.stream.ejemplos.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Specter", "1245dada"));
        lista.add(new Usuario("Merest", "7894dada"));
        lista.add(new Usuario("gilros", "9856dada"));
        lista.add(new Usuario("ElOdiseo", "4587dada"));
        lista.add(new Usuario("Aresin", "8956dada"));
        lista.add(new Usuario("Cripto", "5641dada"));
        lista.add(new Usuario("Mercedes", "2354dada"));

        // Cuando tenemos que procesar una gran cantidad de datos, podemos aplicar paralelismo para que cada dato
        // procese en un hilo diferente.
        long t1 = System.currentTimeMillis();
        String resultado = lista.stream()
                .parallel()
                .map(u -> u.getUsuario().toUpperCase().concat(" ")
                .concat(u.getContraseña().toUpperCase()))
                .peek(t ->{
                    System.out.println("Nombre thread " + Thread.currentThread().getName() + " - " + t);
                })
                .flatMap(usuario -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if(usuario.contains("Cripto".toUpperCase())){
                        return Stream.of(usuario);
                    }
                    return Stream.empty();
                }).findAny().orElse("No se encontro");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (t2 - t1));
        System.out.println(resultado);
    }
}
