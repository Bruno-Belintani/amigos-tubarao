package br.com.amigostubarao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class DadosPessoais {

    @Id
    @SequenceGenerator(name = "sq_dados_pessoais", sequenceName = "sq_dados_pessoais", allocationSize = 1)
    @GeneratedValue(generator = "sq_dados_pessoais", strategy = GenerationType.SEQUENCE)
    public Long id;
    public String nomeCompleto;
    public String cpfCnpj;
    public String email;
    public String telefone;
    public String dataNascimento;

    @OneToOne
    @JoinColumn(name  = "info_id")
    private InformacoesAdicionais informacoesAdicionais;

    @ManyToOne
    @JoinColumn(name = "doa_id")
    private Doacao doacao;
}
