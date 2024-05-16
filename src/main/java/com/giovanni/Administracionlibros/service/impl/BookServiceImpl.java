package com.giovanni.Administracionlibros.service.impl;

import com.giovanni.Administracionlibros.entidades.Book;
import com.giovanni.Administracionlibros.persitencia.IBookDAO;
import com.giovanni.Administracionlibros.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements IBookService {


    @Autowired
    private IBookDAO iBookDAO;

    @Override
    public List<Book> findAll() {
        return iBookDAO.findAll();
    }

    @Override
    public Optional<Book> finById(Integer id) {
        return iBookDAO.finById(id);
    }

    @Override
    public Optional<Book> findByTitulo(String title) {
        return iBookDAO.findByTitulo(title);
    }

    @Override
    public Optional<Book> findByEditorial(String editorial) {
        return iBookDAO.findByEditorial(editorial);
    }

    @Override
    public void save(Book book) {
        iBookDAO.save(book);

    }

    @Override
    public void deleteById(Integer id) {
        iBookDAO.deleteById(id);

    }
}
