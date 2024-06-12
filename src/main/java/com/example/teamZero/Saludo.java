package com.example.teamZero;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class Saludo {

    @GetMapping("/hola")
    public String saludar(){
        return "Hola como estan!!!";
    }
}
