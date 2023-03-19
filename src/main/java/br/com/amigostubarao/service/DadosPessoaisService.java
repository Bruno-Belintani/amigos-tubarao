package br.com.amigostubarao.service;

import br.com.amigostubarao.controller.dto.DadosPessoaisDto;
import br.com.amigostubarao.entity.DadosPessoais;
import br.com.amigostubarao.repository.DadosPessoaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DadosPessoaisService {

    @Autowired
    private DadosPessoaisRepository dadosPessoaisRepository;

    @Transactional
    public DadosPessoais criar(DadosPessoais dadosPessoais) {
        return dadosPessoaisRepository.save(dadosPessoais);
    }

    @Transactional
    @Modifying
    public DadosPessoais atualizar(DadosPessoais dadosPessoais) {
        var resultado = dadosPessoaisRepository.findById(dadosPessoais.getId()).orElseThrow();
        var atualizado = DadosPessoais.from(resultado, dadosPessoais);
        return dadosPessoaisRepository.save(atualizado);
    }

    public DadosPessoais buscarPorId(Long dadosPessoasisId) {
        return dadosPessoaisRepository.findById(dadosPessoasisId).orElseThrow();
    }

    public List<DadosPessoaisDto> buscarTodos() {
        return dadosPessoaisRepository.findAll().stream()
                .map(DadosPessoaisDto::from).collect(Collectors.toList());
    }

    @Transactional
    @Modifying
    public void deletarPorId(Long id) {
        var resultado = dadosPessoaisRepository.findById(id).orElseThrow();
        dadosPessoaisRepository.delete(resultado);
    }

    public DadosPessoais buscarPorCpfCnpj(String cpfCnpj) {
        return dadosPessoaisRepository.findByCpfCnpj(cpfCnpj).orElseThrow();
    }
}
