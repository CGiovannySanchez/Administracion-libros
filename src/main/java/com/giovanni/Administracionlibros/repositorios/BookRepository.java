package com.giovanni.Administracionlibros.repositorios;

import com.giovanni.Administracionlibros.entidades.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

    Optional<Book> findByTitulo(String title);
    Optional<Book> findByEditorial(String editorial);


}
