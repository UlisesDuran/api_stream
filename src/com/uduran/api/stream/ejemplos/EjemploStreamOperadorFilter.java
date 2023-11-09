package com.uduran.api.stream.ejemplos;

import com.uduran.api.stream.ejemplos.modelos.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamOperadorFilter {
    public static void main(String[] args) {

        //Map siempre devuelve el resultado cambiado por que es una Function
        Stream<Usuario> usuarios = Stream
                .of("specter 1234duran", "alex 2010alexis", "Pepa mariana0508", "Pepe gerardoduran042")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
                .filter(u -> u.getUsuario().equals("specter"));

        List<Usuario> lista = usuarios.collect(Collectors.toList());
        lista.forEach(System.out::println);

    }
}
