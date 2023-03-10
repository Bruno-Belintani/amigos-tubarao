package br.com.amigostubarao.controller;

import br.com.amigostubarao.model.InformacoesAdicionais;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/informacoes-adicionais")
public class InformacoesAdicionaisController {

    @PostMapping
    public void cadastrar(@RequestBody InformacoesAdicionais informacoesAdicionais) {
        log.info(informacoesAdicionais.toString());
    }
}
