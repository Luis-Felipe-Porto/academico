package com.microsservice.academico.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("v1/academico")
public record AcademicoController() {

    @PostMapping("/{cpf}")
    public ResponseEntity<String> matricularAluno(@PathVariable String cpf){
        return ResponseEntity.ok(cpf);
    }
}
