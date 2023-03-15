package br.com.amigostubarao.controller;

import br.com.amigostubarao.controller.dto.DadosPessoaisDto;
import br.com.amigostubarao.entity.DadosPessoais;
import br.com.amigostubarao.service.DadosPessoaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/dados-pessoais", produces = MediaType.APPLICATION_JSON_VALUE)
public class DadosPessoaisController {

    @Autowired
    private DadosPessoaisService dadosPessoaisService;

    @PostMapping
    public DadosPessoaisDto criar(@RequestBody DadosPessoais dadosPessoais) {
        var resultado = dadosPessoaisService.criar(dadosPessoais);
        return DadosPessoaisDto.from(resultado);
    }

    @PutMapping
    public ResponseEntity<DadosPessoaisDto> atualizar(@RequestBody DadosPessoais dadosPessoais) {
        var resultado = dadosPessoaisService.atualizar(dadosPessoais);
        var convertido = DadosPessoaisDto.from(resultado);
        return ResponseEntity.ok(convertido);
    }

    @GetMapping
    public ResponseEntity<List<DadosPessoaisDto>> buscarTodos() {
        var dadosPessoaisDto = dadosPessoaisService.buscarTodos();
        return ResponseEntity.status(HttpStatus.CREATED).body(dadosPessoaisDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable("id") Long id) {
        dadosPessoaisService.deletarPorId(id);
    }
}