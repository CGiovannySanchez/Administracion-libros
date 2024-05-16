package com.giovanni.Administracionlibros.service;

import com.giovanni.Administracionlibros.entidades.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorService {

    List<Autor> findAll();

    Optional<Autor> findById(Integer id);

    void save(Autor autor);

    void deleteById(Integer id);
}
