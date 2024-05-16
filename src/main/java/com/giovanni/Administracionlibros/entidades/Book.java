package com.giovanni.Administracionlibros.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "LIBRO")
public class Book {
    @Id
    @Column(name = "ID_LIBRO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBook;

    @Column(name = "TITULO", nullable = false)
    private  String title;

    @Column(name = "EDITORIAL", nullable = false)
    private  String editorial;

    @Column(name = "NUMERO_PAGINAS", nullable = false)
    private Integer numberPages;

    @Column(name = "PRECIO")
    private Double price;

    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDate publicationDate;

    @ManyToOne
    @JoinColumn(name = "ID_AUTOR", nullable = false)
    private Autor autor;
}
