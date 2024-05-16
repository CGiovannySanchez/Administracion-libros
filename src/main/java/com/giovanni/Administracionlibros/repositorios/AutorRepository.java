package com.giovanni.Administracionlibros.repositorios;

import com.giovanni.Administracionlibros.entidades.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Integer> {
}
