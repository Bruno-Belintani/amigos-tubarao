package br.com.amigostubarao.repository;
import br.com.amigostubarao.model.Doacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoacaoRepository extends JpaRepository<Doacao, Long> {
}
