package com.giovanni.Administracionlibros.persitencia.impl;

import com.giovanni.Administracionlibros.entidades.Book;
import com.giovanni.Administracionlibros.persitencia.IBookDAO;
import com.giovanni.Administracionlibros.repositorios.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BookDAOImpl implements IBookDAO {
    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Optional<Book> finById(Integer id) {
        return bookRepository.findById(id);
    }

    @Override
    public Optional<Book> findByTitulo(String title) {
        return bookRepository.findByTitulo(title);
    }

    @Override
    public Optional<Book> findByEditorial(String editorial) {
        return bookRepository.findByEditorial(editorial);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);

    }

    @Override
    public void deleteById(Integer id) {
        bookRepository.deleteById(id);
    }
}
