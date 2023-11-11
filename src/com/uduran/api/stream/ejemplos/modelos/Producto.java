package com.uduran.api.stream.ejemplos.modelos;

public class Producto {
    private double precio;
    private int pedidoMin;

    public Producto(double precio, int pedidoMin) {
        this.precio = precio;
        this.pedidoMin = pedidoMin;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPedidoMin() {
        return pedidoMin;
    }

    public void setPedidoMin(int pedidoMin) {
        this.pedidoMin = pedidoMin;
    }
}
