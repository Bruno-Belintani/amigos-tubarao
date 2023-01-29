package br.com.amigostubarao.model;

public class InformacoesAdicionais {

    public String cep;
    public String endereco;
    public String cidade;
    public String numero;
    public String estado;
    public String complemento;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "InformacoesAdicionais{" +
                "cep='" + cep + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cidade='" + cidade + '\'' +
                ", numero='" + numero + '\'' +
                ", estado='" + estado + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
