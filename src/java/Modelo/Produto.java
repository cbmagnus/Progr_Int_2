package Modelo;

public class Produto {
    private String produto;
    private int quantidade;
    private double valor;
    private double peso;
    private String dataCompra;
    private String localCompra;

    public Produto() {
    }

    public Produto(String produto, int quantidade, double valor, double peso, String dataCompra, String localCompra) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
        this.peso = peso;
        this.dataCompra = dataCompra;
        this.localCompra = localCompra;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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
