package br.com.amigostubarao.controller;

import br.com.amigostubarao.model.DadosPessoais;
import br.com.amigostubarao.repository.DadosPessoaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dados-pessoais")
public class DadosPessoaisController {

    @Autowired
    private DadosPessoaisRepository dadosPessoaisRepository;

    @GetMapping
    public List<DadosPessoais> listar() {
        return dadosPessoaisRepository.findAll();
    }

    @PostMapping
    public void cadastrar(@RequestBody DadosPessoais dadosPessoais) {
        dadosPessoaisRepository.save(dadosPessoais);
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
