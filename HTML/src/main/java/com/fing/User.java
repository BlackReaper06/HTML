package com.fing;

import java.util.List;

public class User {

    private String nombre;
    private String correo;
    private String github;
    private List<String> listaCosas;

    public User(String nombre, String correo, String github, List<String> listaCosas) {
        this.nombre = nombre;
        this.correo = correo;
        this.github = github;
        this.listaCosas = listaCosas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getGithub() {
        return github;
    }

    public List<String> getListaCosas() {
        return listaCosas;
    }
}