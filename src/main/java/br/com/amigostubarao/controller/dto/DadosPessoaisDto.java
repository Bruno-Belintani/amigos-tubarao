package br.com.amigostubarao.controller.dto;

import br.com.amigostubarao.model.DadosPessoais;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class DadosPessoaisDto {
    public Long id;
    public String nomeCompleto;
    public String cpfCnpj;
    public String email;
    public String telefone;
    public String dataNascimento;

    public DadosPessoaisDto(Long id, String nomeCompleto, String cpfCnpj, String email, String telefone, String dataNascimento) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public static DadosPessoaisDto from(DadosPessoais dadosPessoais) {
        return new DadosPessoaisDto(
                dadosPessoais.getId(),
                dadosPessoais.getNomeCompleto(),
                dadosPessoais.getCpfCnpj(),
                dadosPessoais.getEmail(),
                dadosPessoais.getTelefone(),
                dadosPessoais.getDataNascimento()
        );
    }

    /*
    public static DadosPessoaisDto converterDtoUsandoObjectMapper(DadosPessoais dadosPessoais) {
        ObjectMapper x = new ObjectMapper();
        return x.writeValue(dadosPessoais, DadosPessoaisDto.class);
    }*/
}
