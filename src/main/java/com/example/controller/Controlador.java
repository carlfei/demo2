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

    @Autowired
    Libros lib;

    List<Libros> libros;

    @GetMapping("/list/{id}")
    public List<Libros> listar(@PathVariable(value = "id") Long id){

        return (biblioteca.findById(id)).stream().collect(Collectors.toList());

    }
    @GetMapping("/listAdd/{id}/{titulo}/{autor}")
    public List<Libros> anyadir(@PathVariable(value = "id") Long id,
                               @PathVariable(value = "titulo") String titulo,
                               @PathVariable(value = "autor") String autor){

                             biblioteca.save(lib.getId());

        //libros.addAll(id,titulo,autor);
                        //libros.get(0).setId();
//                    biblioteca.saveAll(id,titulo,autor);
       // biblioteca.save();
        return (biblioteca.findById(id)).stream().collect(Collectors.toList());

    }



}
