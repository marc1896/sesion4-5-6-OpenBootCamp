package com.example.Eje.sesion456.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("api/hola")
    public String holaMundo(){
        return "Hola mundo desde un controlador";
    }
}
