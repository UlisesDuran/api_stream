package com.uduran.api.stream.ejemplos;

import com.uduran.api.stream.ejemplos.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Specter", "1245dada"));
        lista.add(new Usuario("Merest", "7894dada"));
        lista.add(new Usuario("gilros", "9856dada"));
        lista.add(new Usuario("ElOdiseo", "4587dada"));
        lista.add(new Usuario("Aresin", "8956dada"));
        lista.add(new Usuario("Cripto", "5641dada"));
        lista.add(new Usuario("specter", "2354dada"));

        lista.stream()
                .map(u -> u.getUsuario().toUpperCase()
                .concat(" ")
                .concat(u.getContraseña().toUpperCase()))
                .flatMap(usuario -> {
                    if(usuario.contains("specter".toUpperCase())){
                        return Stream.of(usuario);
                    }
                    return Stream.empty();
                }).forEach(System.out::println);
    }
}
