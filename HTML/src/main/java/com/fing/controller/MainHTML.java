package com.fing.controller;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.fing.User;

@Controller
public class MainHTML {

    @GetMapping("/perfil")
    public String info(Model model) {

        model.addAttribute("theme", "red");

        User user = new User(
                "Erick Ramirez",
                "ultraman060607@email.com",
                "BlackReaper06",
                Arrays.asList(
                        "Comida china",
                        "Cyberpunk",
                        "Mac DeMarco",
                        "HxH",
                        "20 Años",
                        "Java",
                        "Horchata",
                        "Dormir",
                        "Gatos",
                        "Batman"
                )
        );

        model.addAttribute("user", user);

        return "index";
    }
}