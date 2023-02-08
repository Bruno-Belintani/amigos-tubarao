package br.com.amigostubarao.controller;

import br.com.amigostubarao.model.DadosPessoais;
import br.com.amigostubarao.repository.DadosPessoaisRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados-pessoais")
@Slf4j
public class DadosPessoaisController {

    @Autowired
    private DadosPessoaisRepository dadosPessoaisRepository;

    @PostMapping
    public void cadastro(@RequestBody DadosPessoais dadosPessoais) {
        dadosPessoaisRepository.save(dadosPessoais);
         log.info(dadosPessoais.toString());

    }
}
