package com.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@Entity
public class Libros {

    @Id
    private int id;
    @Column
    private String titulo;
    @Column
    private String autor;


}
