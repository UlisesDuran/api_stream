package com.uduran.api.stream.ejemplos.modelos;

public class Usuario {
    private String usuario;
    private String contraseña;

    private int id;

    private int ultimoId;

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.id = ++this.ultimoId;
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
}
