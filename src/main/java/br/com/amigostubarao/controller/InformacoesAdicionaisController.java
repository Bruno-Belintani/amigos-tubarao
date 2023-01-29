package br.com.amigostubarao.controller;

import br.com.amigostubarao.model.InformacoesAdicionais;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/informacoes-adicionais")
public class InformacoesAdicionaisController {
    Logger logger = LoggerFactory.getLogger(InformacoesAdicionaisController.class);

    @PostMapping
    public void cadastro(@RequestBody InformacoesAdicionais informacoesAdicionais){
        logger.info(informacoesAdicionais.toString());
    }
}
