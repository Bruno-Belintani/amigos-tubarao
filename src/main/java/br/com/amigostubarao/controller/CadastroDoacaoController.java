package br.com.amigostubarao.controller;
import br.com.amigostubarao.model.CadastroDoacao;
import br.com.amigostubarao.model.DadosPessoais;
import br.com.amigostubarao.model.InformacoesAdicionais;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/cadastro-doacao")

public class CadastroDoacaoController {

    Logger logger = LoggerFactory.getLogger(CadastroDoacaoController.class);

    @PostMapping
    public void cadastro(@RequestBody CadastroDoacao cadastroDoacao) {

        logger.info(cadastroDoacao.toString());
    }

    }






