package br.com.amigostubarao.service;

import br.com.amigostubarao.entity.Doacao;
import br.com.amigostubarao.repository.DoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Random;

@Service
public class DoacaoService {

    @Autowired
    private DoacaoRepository doacaoRepository;

    @Autowired
    private DadosPessoaisService dadosPessoaisService;

    @Transactional
    public boolean doar(String valor, String identificador) {

        //Recuperar o doador.
        var doador = dadosPessoaisService.buscarPorCpfCnpj(identificador);

        var doacao = new Doacao();
        doacao.setValorDoado(Double.parseDouble(valor));
        doacao.setDadosPessoais(doador);

        doacaoRepository.save(doacao);

        return true;
    }
}
