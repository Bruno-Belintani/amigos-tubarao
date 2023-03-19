package br.com.amigostubarao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
@Table(name = "dados_pessoais")
public class DadosPessoais {

    @Id
    //@SequenceGenerator(name = "sq_dados_pessoais", sequenceName = "sq_dados_pessoais", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dados_pessoais_id")
    public Long id;

    @Column(name = "nome_completo")
    public String nomeCompleto;

    @Column(name = "cpf_cnpj", unique = true)
    public String cpfCnpj;

    @Column(name = "email")
    public String email;

    @Column(name = "telefone")
    public String telefone;

    @Column(name = "data_nascimento")
    public String dataNascimento;

    public static DadosPessoais from(DadosPessoais resultado, DadosPessoais recurso) {
        resultado.setNomeCompleto(recurso.getNomeCompleto());
        resultado.setEmail(recurso.getEmail());
        resultado.setCpfCnpj(recurso.getCpfCnpj());
        resultado.setDataNascimento(recurso.getCpfCnpj());
        resultado.setTelefone(recurso.getTelefone());
        return resultado;
    }
}
