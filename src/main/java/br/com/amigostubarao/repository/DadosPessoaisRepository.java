package br.com.amigostubarao.repository;

import br.com.amigostubarao.model.DadosPessoais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadosPessoaisRepository extends JpaRepository<DadosPessoais, Long> {
}
