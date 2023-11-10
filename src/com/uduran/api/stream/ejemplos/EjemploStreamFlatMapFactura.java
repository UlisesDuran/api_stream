package com.uduran.api.stream.ejemplos;

import com.uduran.api.stream.ejemplos.modelos.Factura;
import com.uduran.api.stream.ejemplos.modelos.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Specter", "1234gilro");
        Usuario u2 = new Usuario("Alexgris", "7894gilro");

        u1.addFactura(new Factura("Compras tegnología"));
        u1.addFactura(new Factura("Muebles"));

        u2.addFactura(new Factura("Bicicleta"));
        u2.addFactura(new Factura("Notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);

        /* Esta es la forma convencional de documentar las facturas de los usuarios.
        for (Usuario u: usuarios){
            for (Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }
        */

        // Ahora lo vamos a ver utilizando el ApiStream.
        // Con unas pocas lineas de codigo, 1 nada mas, pues obtenemos el mismo resultado.
        usuarios.stream().flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion()
                        .concat(" Cliente: ").concat(f.getUsuario().toString())));
    }
}
