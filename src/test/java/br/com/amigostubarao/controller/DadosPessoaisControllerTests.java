package br.com.amigostubarao.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
public class DadosPessoaisControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @DisplayName("Cadastrar um novo registro no banco de dados do model Dados Pessoais.")
    @Test
    void dadoUmJsonDadosPessoaisQuandoCriarEntaoRetornaraHttpStatus201() throws Exception {

        mockMvc.perform(post("/v1/dados-pessoais")
                        .contentType(MediaType.APPLICATION_JSON)
                        .characterEncoding("utf-8")
                        .content(getJson()))
                        .andDo(print())//Para ver logs.
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").isNotEmpty());
    }

    @DisplayName("Retonar todos os dados.")
    @Test
    void retonarTodosOsDadosPessoaisEhttpStatus200() throws Exception {

        mockMvc.perform(get("/v1/dados-pessoais")
                        .contentType(MediaType.APPLICATION_JSON)
                        .characterEncoding("utf-8"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    private String getJson() {
        return "{  \n" +
               "    \"nomeCompleto\":\"Mike\",\n" +
               "    \"cpfCnpj\":\"" + UUID.randomUUID().toString().substring(0, 14) + "\",\n" +
               "    \"email\":\"mike@gmail.com\",\n" +
               "    \"telefone\":\"(11)92222-1111\"\n"+
               "}";
    }
}
