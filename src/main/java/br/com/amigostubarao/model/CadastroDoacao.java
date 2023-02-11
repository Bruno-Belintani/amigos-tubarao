package br.com.amigostubarao.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CadastroDoacao {

    @Id
    public double valorMeta;
    public  double valorDoado;
    public double percentualDoado;

    public double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public double getValorDoado() {
        return valorDoado;
    }

    public void setValorDoado(double valorDoado) {
        this.valorDoado = valorDoado;
    }

    public double getPercentualDoado() {
        return percentualDoado;
    }

    public void setPercentualDoado(double percentualDoado) {
        this.percentualDoado = percentualDoado;
    }

    @Override
    public String toString() {
        return "CadastroDacao{" +
                "valorMeta='" + valorMeta + '\'' +
                ", valorDoado='" + valorDoado + '\'' +
                ", percentualDoado='" + percentualDoado + '\'' +

                '}';
    }

}
