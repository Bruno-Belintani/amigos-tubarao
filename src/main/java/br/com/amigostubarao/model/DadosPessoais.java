package br.com.amigostubarao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class DadosPessoais {

    @Id
    public Long id;
    public String nomeCompleto;
    public String cpfCnpj;
    public String email;
    public String telefone;
    public String dataNascimento;
}
