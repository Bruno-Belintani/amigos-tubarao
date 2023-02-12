package br.com.amigostubarao.controller;

import br.com.amigostubarao.model.Doacao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/cadastro-doacao")
public class DoacaoController {

    @PostMapping
    public void cadastro(@RequestBody Doacao cadastroDoacao) {
        log.info(cadastroDoacao.toString());
    }
}






