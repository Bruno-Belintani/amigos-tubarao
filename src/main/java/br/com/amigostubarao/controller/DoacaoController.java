package br.com.amigostubarao.controller;

import br.com.amigostubarao.model.DadosPessoais;
import br.com.amigostubarao.model.Doacao;
import br.com.amigostubarao.repository.DadosPessoaisRepository;
import br.com.amigostubarao.repository.DoacaoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/cadastro-doacao")
public class DoacaoController {

    @Autowired
    private DoacaoRepository doacaoRepository;

    @GetMapping
    public List<Doacao> listar() {
        return doacaoRepository.findAll();
    }
    @PostMapping
    public void cadastrar(@RequestBody Doacao doacao) {
        doacaoRepository.save(doacao);
    }
    @PutMapping
    public void alterar(@RequestBody Doacao doacao) {
        doacaoRepository.save(doacao);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        doacaoRepository.deleteById(id);
    }
}




