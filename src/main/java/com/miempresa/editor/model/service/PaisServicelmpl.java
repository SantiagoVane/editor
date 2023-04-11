package com.miempresa.editor.model.service;

import com.miempresa.editor.model.dao.IPaisDao;
import com.miempresa.editor.model.entities.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * clase implementa el servicio de pais
 * un servicio es un objeto controlado por el contenedor de Spring
 */
@Service
public class PaisServicelmpl implements IPaisService{

    @Autowired
    IPaisDao paisDao;

    @Override
    public Pais save(Pais pais) {
        return paisDao.save(pais);
    }

    @Override
    public void delete(Pais pais) {
        paisDao.delete(pais);
    }

    @Override
    public Pais update(Pais pais) {
        return paisDao.save(pais);
    }

    /**
     * Este metodo lista los paises guardados
     * @return una lista de paises
     */
    @Override
    public List<Pais> findAll() { //esto lista
        return (List<Pais>) paisDao.findAll();
    }

    @Override
    public Pais findById(Long id) {
        return (Pais) paisDao.findById(id).get();
    }

}
