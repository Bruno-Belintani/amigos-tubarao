package br.com.amigostubarao.service;

import br.com.amigostubarao.repository.DoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DoacaoService {

    @Autowired
    private DoacaoRepository doacaoRepository;

    @Transactional
    public void doar(String valor, String identificador) {

    }
}
