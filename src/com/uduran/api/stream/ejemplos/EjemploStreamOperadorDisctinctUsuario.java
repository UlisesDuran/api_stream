package com.uduran.api.stream.ejemplos;

import com.uduran.api.stream.ejemplos.modelos.Usuario;

import java.util.stream.Stream;

public class EjemploStreamOperadorDisctinctUsuario {
    public static void main(String[] args) {

        Stream<Usuario> usuarios = Stream
                .of("specter 1234duran", "specter 1234duran", "specter 1234duran", "alex 2010alexis", "Pepa mariana0508", "Pepe gerardoduran042")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
                .distinct();


        usuarios.forEach(System.out::println);

    }
}
