package com.giovanni.Administracionlibros.persitencia;

import com.giovanni.Administracionlibros.entidades.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorDAO {

    List<Autor> findAll();

    Optional<Autor> findById(Integer id);

    void save(Autor autor);

    void deleteById(Integer id);
}
