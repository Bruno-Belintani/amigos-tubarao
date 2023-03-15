package br.com.amigostubarao.service;

import br.com.amigostubarao.entity.DadosPessoais;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class DadosPessoaisServiceTest {

    @Autowired
    private DadosPessoaisService dadosPessoaisService;

    @Test
    void deveCriarNovoDadosPessoais() {

        String mockCpfCnpj = UUID.randomUUID().toString().substring(0, 14);

        DadosPessoais dadosPessoais = new DadosPessoais();
        dadosPessoais.setNomeCompleto("Anthony Jorge Jorge da Rosa");
        dadosPessoais.setEmail("anthony_darosa@fosj.unesp.br");
        dadosPessoais.setTelefone("8338384251");
        dadosPessoais.setCpfCnpj(mockCpfCnpj);

        DadosPessoais result = dadosPessoaisService.criar(dadosPessoais);

        Assertions.assertNotNull(result.getId());
        Assertions.assertEquals(result.getNomeCompleto(), dadosPessoais.getNomeCompleto());
        Assertions.assertEquals(result.getEmail(), dadosPessoais.getEmail());
        Assertions.assertEquals(result.getTelefone(), dadosPessoais.getTelefone());
        Assertions.assertEquals(result.getCpfCnpj(), mockCpfCnpj);
    }
}