package br.com.amigostubarao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
@Table(name = "informacoes_adicionais")
public class InformacoesAdicionais {

    @Id
    @SequenceGenerator(name = "sq_informacoes_adicionais", sequenceName = "sq_informacoes_adicionais", allocationSize = 1)
    @GeneratedValue(generator = "sq_informacoes_adicionais", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "cep")
    public String cep;

    @Column(name = "endereco")
    public String endereco;

    @Column(name = "cidade")
    public String cidade;

    @Column(name = "numero")
    public String numero;

    @Column(name = "estado")
    public String estado;

    @Column(name = "complemento")
    public String complemento;

    @OneToOne
    @JoinColumn(name = "dados_pessoais_id")
    private DadosPessoais dadosPessoais;
}
