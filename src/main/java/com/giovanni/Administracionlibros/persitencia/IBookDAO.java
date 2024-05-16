package com.giovanni.Administracionlibros.persitencia;


import com.giovanni.Administracionlibros.entidades.Book;

import java.util.List;
import java.util.Optional;


public interface IBookDAO {

    List<Book> findAll();

    Optional<Book> finById(Integer id);

    Optional<Book> findByTitulo(String title);

    Optional<Book> findByEditorial(String editorial);

    void save(Book book);

    void deleteById(Integer id);
}
