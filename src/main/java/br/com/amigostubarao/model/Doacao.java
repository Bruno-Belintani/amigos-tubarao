package br.com.amigostubarao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Doacao {

    @Id
    public Long id;
    public double valorMeta;
    public double valorDoado;
    public double percentualDoado;

    @OneToMany
    @JoinColumn(name = "id")
    private DadosPessoais dadosPessoais;
}
