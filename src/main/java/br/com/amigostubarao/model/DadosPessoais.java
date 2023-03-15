package br.com.amigostubarao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
@Table(name = "dados_pessoais")
public class DadosPessoais {

    @Id
    @SequenceGenerator(name = "sq_dados_pessoais", sequenceName = "sq_dados_pessoais", allocationSize = 1)
    @GeneratedValue(generator = "sq_dados_pessoais", strategy = GenerationType.SEQUENCE)
    public Long id;

    @Column(name = "nome_completo")
    public String nomeCompleto;

    @Column(name = "cpf_cnpj")
    public String cpfCnpj;

    @Column(name = "email")
    public String email;

    @Column(name = "telefone")
    public String telefone;

    @Column(name = "data_nascimento")
    public String dataNascimento;

    @OneToOne
    @JoinColumn(name  = "informacao_id")
    private InformacoesAdicionais informacoesAdicionais;

    @ManyToOne
    @JoinColumn(name = "doacao_id")
    private Doacao doacao;
}
