package Modelo;


import java.util.Date;


public class Alfajor {
    private String tipo;
    private Date validade;
    private Date producao;

    public Alfajor(String tipo, Date validade, Date producao) {
        this.tipo = tipo;
        this.validade = validade;
        this.producao = producao;
    }

    public Alfajor() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Date getProducao() {
        return producao;
    }

    public void setProducao(Date producao) {
        this.producao = producao;
    }
    
    
}
