package br.com.amigostubarao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Doacao {

    @Id
    public Long doa_id;
    public double valorMeta;
    public double valorDoado;
    public double percentualDoado;

    @OneToOne
    @JoinColumn(name = "dado_id")
    private DadosPessoais dadosPessoais;
}
