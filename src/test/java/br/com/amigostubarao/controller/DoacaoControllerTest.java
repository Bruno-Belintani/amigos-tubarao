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
class DoacaoControllerTest {


    @LocalServerPort
    private int port;

    @Autowired
    protected TestRestTemplate rest;

    @Test
    void deveEfetivarUmaDoacaoEntaoRetorna200() throws URISyntaxException {
        //given
        URI uri = new URI("http://localhost:" + port + "/v1/doacao/100/identificador/52750941083");
        //when
        ResponseEntity<Boolean> result = this.rest.exchange(uri, HttpMethod.POST, null, Boolean.class);
        //then
        Assertions.assertEquals(result.getStatusCode(), HttpStatus.OK);
    }
}
