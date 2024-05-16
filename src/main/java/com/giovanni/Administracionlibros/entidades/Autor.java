package com.giovanni.Administracionlibros.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "AUTOR")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;

    @Column(name = "NOMBRES", nullable = false)
    private String names;

    @Column(name = "APELLIDOS", nullable = false)
    private String lastname;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Book> books;
}
