package br.com.amigostubarao.repository;

import br.com.amigostubarao.entity.DadosPessoais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DadosPessoaisRepository extends JpaRepository<DadosPessoais, Long> {

    Optional<DadosPessoais> findByCpfCnpj(String cpfCnpj);
}
