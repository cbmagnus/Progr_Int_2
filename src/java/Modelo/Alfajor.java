
package Modelo;

public class Alfajor {

    private String tipoAlfajor;
    private int quantidade;
    private double valorVenda;
    private double valorCusto;

    public Alfajor() {
    }

    public Alfajor(String tipoAlfajor, int quantidade, double valorVenda, double valorCusto) {
        this.tipoAlfajor = tipoAlfajor;
        this.quantidade = quantidade;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
    }

    public String getTipoAlfajor() {
        return tipoAlfajor;
    }

    public void setTipoAlfajor(String tipoAlfajor) {
        this.tipoAlfajor = tipoAlfajor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }
    
    
}
