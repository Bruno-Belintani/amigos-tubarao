package br.com.amigostubarao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class InformacoesAdicionais {

    @Id
    private Long info_d;
    public String cep;
    public String endereco;
    public String cidade;
    public String numero;
    public String estado;
    public String complemento;

    @OneToOne
    @JoinColumn(name = "id")
    private DadosPessoais dadosPessoais;
}
