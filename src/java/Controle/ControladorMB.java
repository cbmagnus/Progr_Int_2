package Controle;


import Modelo.Produto;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.apache.jasper.tagplugins.jstl.ForEach;


@ManagedBean
@SessionScoped        
public class ControladorMB {
    private List<Usuario> listaUsuarios;
    private List<Produto> listaProdutos;
    private Produto produto;
    private Usuario usuario;
    private boolean logado;

    public ControladorMB() {
        logado = false;
        
        usuario = new Usuario();
        produto = new Produto();
        
        listaUsuarios = new ArrayList<Usuario>();
        listaProdutos = new ArrayList<Produto>();
        
        listaUsuarios.add(new Usuario("admin","admin"));
        listaUsuarios.add(new Usuario("darlan","123"));
        listaUsuarios.add(new Usuario("teste","123"));
        
        listaProdutos.add(new Produto("Chocolate Branco Nestle 1Kg", 5, 22.50, "05/08/15", "nenhum"));
        listaProdutos.add(new Produto("Chocolate Preto Nestle 1Kg", 2, 18.50, "05/08/15", "nenhum"));
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public boolean estaLogado(){
        return(logado);
    }
    
    public String verificaLogin()
    {
        if(listaUsuarios.contains(usuario)){
            logado = true;
            return "incluirProduto?faces-redirect=true";
        }
        else{
            FacesContext contexto = FacesContext.getCurrentInstance();
            FacesMessage mensagem = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, 
                    "Login Inválido!",
                    "Usuário e/ou senha incorretos. Tente novamente!");
            contexto.addMessage("mensagemLogin",mensagem);
            
            return "login";
        }
    }
    
    public String realizaLogout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        logado=false;
        return("login?faces-redirect=true");
    }

    public void incluiProduto(){
        listaProdutos.add(produto);
        produto = new Produto();
    }
    
    
}
