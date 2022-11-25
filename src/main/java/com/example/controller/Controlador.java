package com.example.controller;

import com.example.model.Libros;
import com.example.repository.Biblioteca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Controlador {
    @Autowired
    Biblioteca biblioteca;
    List<Libros> libros;

    @GetMapping("/list/{id}")
    public List<Libros> listar(@PathVariable(value = "id") Long id){

        List<Libros> collect = (biblioteca.findById(id)).stream().collect(Collectors.toList());
        return collect;

    }



}
