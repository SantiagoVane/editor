package com.miempresa.editor.controller;

import com.miempresa.editor.model.service.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pais-service")
public class PaisRestController {

    @Autowired // lo crea el contenedor y lo pasa o si ya existe simplemente lo pasa
    IPaisService paisService;
}
