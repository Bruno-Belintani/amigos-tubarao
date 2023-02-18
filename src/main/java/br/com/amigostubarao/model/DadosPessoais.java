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
    public Long dado_id;
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
