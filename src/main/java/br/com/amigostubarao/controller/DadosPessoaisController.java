package br.com.amigostubarao.controller;

import br.com.amigostubarao.model.DadosPessoais;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados-pessoais")
public class DadosPessoaisController {

    Logger logger = LoggerFactory.getLogger(DadosPessoaisController.class);

    @PostMapping
    public void cadastro(@RequestBody DadosPessoais dadosPessoais) {

    logger.info(dadosPessoais.toString());

    }
}
