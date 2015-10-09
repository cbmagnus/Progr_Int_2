package Controle;

import Modelo.Producao;
import Modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProducaoMB {

    private List<Producao> listProducao;
    private List<Produto> listProdutos;
    private Producao producao;
    private Produto produto;

    public ProducaoMB() {
        listProducao = new ArrayList<Producao>();
        listProdutos = new ArrayList<Produto>();
        producao = new Producao();
        produto = new Produto();
    }

    public List<Producao> getListProducao() {
        return listProducao;
    }

    public void setListProducao(List<Producao> listProducao) {
        this.listProducao = listProducao;
    }

    public Producao getProducao() {
        return producao;
    }

    public void setProducao(Producao producao) {
        this.producao = producao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getListProdutos() {
        return listProdutos;
    }

    public void setListProdutos(List<Produto> listProdutos) {
        this.listProdutos = listProdutos;
    }
    
    
    
    
    
    
    

    public void incluiProdutos() {
        listProdutos = producao.getListProdutosUtilizados();
//        listProdutos.add(produto);
//        produto = new Produto();
    }
    
    public void salvaProducao(){
        listProducao.add(producao);
        producao = new Producao();
    }
    
    public Produto findProdutoByNome(String nome){
        for(Produto e: listProdutos)
            if(e.getProduto().equals(nome))
                return(e);
        return null;
    }
    
    
}
