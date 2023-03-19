package br.com.amigostubarao.controller;

import br.com.amigostubarao.service.DoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/doacao", produces = MediaType.APPLICATION_JSON_VALUE)
public class DoacaoController {

    @Autowired
    private DoacaoService doacaoService;

    @PostMapping("/{valor}/identificador/{identificador}")
    public ResponseEntity<Boolean> doar(@PathVariable(value = "valor") String valor,
                               @PathVariable("identificador") String identificador) {
        var resultado = doacaoService.doar(valor, identificador);
        return ResponseEntity.ok(resultado);
    }
}




