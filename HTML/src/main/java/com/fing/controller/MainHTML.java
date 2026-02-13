package com.fing.controller;

import com.fing.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainHTML {

    @GetMapping("/usuario")
    public User obtenerUsuario() {

        List<String> cosas = new ArrayList<>();

        cosas.add("Comida china");
        cosas.add("Cyberpunk");
        cosas.add("Mac DeMarco");
        cosas.add("HxH");
        cosas.add("20 Años");
        cosas.add("Java");
        cosas.add("Horchata");
        cosas.add("Dormir");
        cosas.add("Gatos");
        cosas.add("Batman");

        return new User(
                "Erick Ramirez",
                "ultraman060607@email.com",
                "BlackReaper06",
                cosas
        );
    }
}