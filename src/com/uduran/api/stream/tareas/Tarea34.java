package com.uduran.api.stream.tareas;

import com.uduran.api.stream.ejemplos.modelos.Producto;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;

public class Tarea34 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");
        List<Producto> listado = new ArrayList<>();
        listado.add(new Producto(25.99, 12));
        listado.add(new Producto(16.99, 10));
        listado.add(new Producto(10.00, 10));
        listado.add(new Producto(19.99, 24));
        listado.add(new Producto(4.99, 100));
        listado.add(new Producto(1.99, 36));
        listado.add(new Producto(13.99, 12));

        DoubleStream total = listado.stream().flatMapToDouble(p -> DoubleStream.of(p.getPrecio() * p.getPedidoMin()))
                .peek(p -> System.out.println(df.format(p) + " €"));
        DoubleSummaryStatistics totalStats = total.summaryStatistics();
        System.out.println("Total: " + df.format(totalStats.getSum()) + " €.");
    }
}
