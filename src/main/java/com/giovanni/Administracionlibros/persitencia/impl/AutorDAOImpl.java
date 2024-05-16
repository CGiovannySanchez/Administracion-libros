package com.giovanni.Administracionlibros.persitencia.impl;

import com.giovanni.Administracionlibros.entidades.Autor;
import com.giovanni.Administracionlibros.persitencia.IAutorDAO;
import com.giovanni.Administracionlibros.repositorios.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class AutorDAOImpl implements IAutorDAO {
    @Autowired
    private AutorRepository autorRepository;

    @Override
    public List<Autor> findAll() {
        return (List<Autor>) autorRepository.findAll();
    }

    @Override
    public Optional<Autor> findById(Integer id) {
        return autorRepository.findById(id);
    }

    @Override
    public void save(Autor autor) {
        autorRepository.save(autor);

    }

    @Override
    public void deleteById(Integer id) {
        autorRepository.deleteById(id);

    }
}
