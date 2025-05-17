package com.projeto.verificador.controller;

import com.projeto.verificador.model.ResultadoSistema;
import com.projeto.verificador.model.SistemaLinear;
import com.projeto.verificador.service.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sistemas")
public class SistemaController {

    @Autowired
    private SistemaService sistemaService;

    @PostMapping("/resolver")
    public ResultadoSistema resolverSistema(@RequestBody SistemaLinear sistema) {
        return sistemaService.resolver(sistema);
    }
}
