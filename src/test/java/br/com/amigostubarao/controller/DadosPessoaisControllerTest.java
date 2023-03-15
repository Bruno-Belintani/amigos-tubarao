package br.com.amigostubarao.controller;

import br.com.amigostubarao.controller.dto.DadosPessoaisDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DadosPessoaisControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    protected TestRestTemplate rest;

    @Test
    void deveRetornarListaDadosPessoais() throws URISyntaxException {
        //given
        URI uri = new URI("http://localhost:" + port + "/v1/dados-pessoais");
        //when
        ResponseEntity<List<DadosPessoaisDto>> result = this.rest.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<>() {});
        //then
        Assertions.assertEquals(result.getStatusCode(), HttpStatus.OK);
        Assertions.assertFalse(result.getBody().isEmpty());
    }
}