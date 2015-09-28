
package Controle;

import Modelo.Alfajor;
import Modelo.Producao;
import Modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProducaoMB {

    private List<Producao> listaProducao;
    private List<Produto> listProd;
    private Producao producao;
    private Alfajor alfajor;
    private Produto produto;
    
    public ProducaoMB() {
        producao = new Producao();
        listaProducao = new ArrayList<Producao>();
        listProd = new ArrayList<Produto>();
        alfajor = new Alfajor();
        produto = new Produto();        
    }

    public List<Producao> getListaProducao() {
        return listaProducao;
    }

    public void setListaProducao(List<Producao> listaProducao) {
        this.listaProducao = listaProducao;
    }

    public List<Produto> getListProd() {
        return listProd;
    }

    public void setListProd(List<Produto> listProd) {
        this.listProd = listProd;
    }

    public Producao getProducao() {
        return producao;
    }

    public void setProducao(Producao producao) {
        this.producao = producao;
    }

    public Alfajor getAlfajor() {
        return alfajor;
    }

    public void setAlfajor(Alfajor alfajor) {
        this.alfajor = alfajor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
