package com.giovanni.Administracionlibros.service.impl;

import com.giovanni.Administracionlibros.entidades.Autor;
import com.giovanni.Administracionlibros.persitencia.IAutorDAO;
import com.giovanni.Administracionlibros.service.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AutorServiceImpl implements IAutorService {

    @Autowired
    private IAutorDAO iAutorDAO;


    @Override
    public List<Autor> findAll() {
        return iAutorDAO.findAll();
    }

    @Override
    public Optional<Autor> findById(Integer id) {
        return iAutorDAO.findById(id);
    }

    @Override
    public void save(Autor autor) {
        iAutorDAO.save(autor);

    }

    @Override
    public void deleteById(Integer id) {
        iAutorDAO.deleteById(id);

    }
}
