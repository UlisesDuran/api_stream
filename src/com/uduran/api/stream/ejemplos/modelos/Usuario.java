package com.uduran.api.stream.ejemplos.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {

    private List<Factura> facturas;
    private String usuario;
    private String contraseña;

    private int id;

    private int ultimoId;

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.id = ++this.ultimoId;
        this.facturas = new ArrayList<>();
    }

    public List<Factura> getFacturas(){
        return facturas;
    }

    public void addFactura(Factura factura){
        this.facturas.add(factura);
        factura.setUsuario(this);
    }

    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return usuario + " " + contraseña;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario1 = (Usuario) o;
        return Objects.equals(usuario, usuario1.usuario) && Objects.equals(contraseña, usuario1.contraseña);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, contraseña);
    }
}
