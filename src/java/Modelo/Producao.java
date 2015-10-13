
package Modelo;

import java.util.List;

public class Producao {
    private String dataProd;
    private Alfajor alfajor;
    private List<Produto> listProdutosUtilizados;
    private int qtdFabricado;    
    private double custoUnitario;
    private double custoTotal;

    public Producao() {
    }

    public Producao(String dataProd, Alfajor alfajor, List<Produto> listProdutosUtilizados, int qtdFabricado,
            double custoUnitario, double custoTotal) {
        this.dataProd = dataProd;
        this.alfajor = alfajor;
        this.listProdutosUtilizados = listProdutosUtilizados;
        this.qtdFabricado = qtdFabricado;
        this.custoUnitario = custoUnitario;
        this.custoTotal = custoTotal;
    }

    public String getDataProd() {
        return dataProd;
    }

    public void setDataProd(String dataProd) {
        this.dataProd = dataProd;
    }

    public Alfajor getAlfajor() {
        return alfajor;
    }

    public void setAlfajor(Alfajor alfajor) {
        this.alfajor = alfajor;
    }

    public List<Produto> getListProdutosUtilizados() {
        return listProdutosUtilizados;
    }

    public void setListProdutosUtilizados(List<Produto> listProdutosUtilizados) {
        this.listProdutosUtilizados = listProdutosUtilizados;
    }

    public int getQtdFabricado() {
        return qtdFabricado;
    }

    public void setQtdFabricado(int qtdFabricado) {
        this.qtdFabricado = qtdFabricado;
    }

    public double getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(double custoUnitario) {
        this.custoUnitario = custoUnitario;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }

    
}
