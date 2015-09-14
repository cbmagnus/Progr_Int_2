package Modelo;


import java.util.Date;


public class Produto {
    private String produto;
    private int quantidade;
    private double valor;
    private String dataCompra;
    private String localCompra;

    public Produto(String produto, int quantidade, double valor, String dataCompra, String localCompra) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
        this.dataCompra = dataCompra;
        this.localCompra = localCompra;
    }

    public Produto() {
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getLocalCompra() {
        return localCompra;
    }

    public void setLocalCompra(String localCompra) {
        this.localCompra = localCompra;
    }
    
}
