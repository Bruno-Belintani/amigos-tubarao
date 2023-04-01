package br.com.amigostubarao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
@Table(name = "doacoes")
public class Doacao {

    @Id
    @SequenceGenerator(name = "sq_doacoes", sequenceName = "sq_doacoes", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_doacoes")
    public Long id;

    @Column(name = "valor_meta")
    public double valorMeta;

    @Column(name = "valor_doado")
    public double valorDoado;

    @Column(name = "percentual_doado")
    public double percentualDoado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dados_pessoais_id", nullable = false)
    private DadosPessoais dadosPessoais;
}
