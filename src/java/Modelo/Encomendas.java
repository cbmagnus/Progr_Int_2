
package Modelo;

public class Encomendas {
    private String data;
    private String nome;
    private double valorCusto;
    private double valorVenda;

    public Encomendas() {
    }

    public Encomendas(String data, String nome, double valorCusto, double valorVenda) {
        this.data = data;
        this.nome = nome;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
}
