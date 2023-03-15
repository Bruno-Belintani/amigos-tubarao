package br.com.amigostubarao.controller;

import br.com.amigostubarao.controller.dto.DadosPessoaisDto;
import br.com.amigostubarao.model.DadosPessoais;
import br.com.amigostubarao.repository.DadosPessoaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dados-pessoais")
public class DadosPessoaisController {

    @Autowired
    private DadosPessoaisRepository dadosPessoaisRepository;

    @GetMapping
    public List<DadosPessoaisDto> listar() {
        return dadosPessoaisRepository.findAll().stream()
                .map(DadosPessoaisDto::from).collect(Collectors.toList());
    }

    @Transactional
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public DadosPessoaisDto cadastrar(@RequestBody DadosPessoais dadosPessoais) {
        var result = dadosPessoaisRepository.save(dadosPessoais);
        return DadosPessoaisDto.from(result);
    }

    @PutMapping
    public void alterar(@RequestBody DadosPessoais dadosPessoais) {
        dadosPessoaisRepository.save(dadosPessoais);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        dadosPessoaisRepository.deleteById(id);
    }
}
