package com.example.controller;

import com.example.repository.Biblioteca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    @Autowired
    Biblioteca biblioteca;


    @GetMapping("/list/{id}")
    public String listar(@PathVariable(value = "id") Long id){

      return  biblioteca.findById(id).toString();

    }



}
