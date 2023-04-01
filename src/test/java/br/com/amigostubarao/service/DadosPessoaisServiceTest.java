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

        String cpfCnpjMock = UUID.randomUUID().toString().substring(0, 14);
        String emailMock = UUID.randomUUID().toString().substring(0, 5) + "@email.com";

        DadosPessoais dadosPessoais = new DadosPessoais();
        dadosPessoais.setNomeCompleto("Nome mock");
        dadosPessoais.setEmail(emailMock);
        dadosPessoais.setTelefone("8338384251");
        dadosPessoais.setCpfCnpj(cpfCnpjMock);

        DadosPessoais result = dadosPessoaisService.criar(dadosPessoais);

        Assertions.assertNotNull(result.getId());
        Assertions.assertEquals(result.getNomeCompleto(), dadosPessoais.getNomeCompleto());
        Assertions.assertEquals(result.getEmail(), dadosPessoais.getEmail());
        Assertions.assertEquals(result.getTelefone(), dadosPessoais.getTelefone());
        Assertions.assertEquals(result.getCpfCnpj(), cpfCnpjMock);
    }
}