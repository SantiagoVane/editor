package com.miempresa.editor.model.service;

import com.miempresa.editor.model.entities.Pais;

import java.util.List;

public interface IPaisService {

    Pais save (Pais pais);

    void delete (Pais pais);

    Pais update(Pais pais);

    List<Pais> findAll();

    Pais findById(Long id);

}
