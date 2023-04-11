package com.miempresa.editor.model.dao;

import com.miempresa.editor.model.entities.Pais;
import org.springframework.data.repository.CrudRepository;

public interface IPaisDao extends CrudRepository<Pais, Long> { // la clase que se manejara y el tipo de llave que se utilizara


}
