package Controle;


import Modelo.Alfajor;
import Modelo.Produto;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped        
public class ControladorMB {
    private List<Usuario> listaUsuarios;
    private List<Produto> listaProdutos;
    private List<Alfajor> listaAlfajores;
    private Produto produto;
    private Usuario usuario;
    private Alfajor alfajor;
    
    private boolean logado;

    public ControladorMB() {
        logado = false;
        
        usuario = new Usuario();
        produto = new Produto();
        alfajor = new Alfajor();
                
        listaUsuarios = new ArrayList<Usuario>();
        listaProdutos = new ArrayList<Produto>();
        listaAlfajores = new ArrayList<Alfajor>();
        
        listaAlfajores.add(new Alfajor("Alfajor chocolate branco", 55, 3.00, 2.00));
        listaAlfajores.add(new Alfajor("Alfajor chocolate preto", 70, 3.00, 2.00));
        listaAlfajores.add(new Alfajor("Alfajor prestigio", 30, 3.00, 2.00));
        
        listaUsuarios.add(new Usuario("admin","admin"));
        listaUsuarios.add(new Usuario("darlan","123"));
        listaUsuarios.add(new Usuario("teste","123"));
        
        listaProdutos.add(new Produto("Chcolate branco Nestle", 4, 22.30, 1, "22/08/15", "Atacadão"));
        listaProdutos.add(new Produto("Chcolate preto Nestle", 2, 18.90, 1, "12/08/15", "Atacadão"));
        
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

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Alfajor> getListaAlfajores() {
        return listaAlfajores;
    }

    public void setListaAlfajores(List<Alfajor> listaAlfajores) {
        this.listaAlfajores = listaAlfajores;
    }

    public Alfajor getAlfajor() {
        return alfajor;
    }

    public void setAlfajor(Alfajor alfajor) {
        this.alfajor = alfajor;
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
    
    public void incluiAlfajor(){
        listaAlfajores.add(alfajor);
        alfajor = new Alfajor();
    }
    
    public Alfajor findAlfaByNome(String nome){
        for(Alfajor e: listaAlfajores)
            if(e.getTipoAlfajor().equals(nome)) 
                return(e);
        return null;
    }
    
    public void removerAlfajor(Alfajor alfajor){
        listaAlfajores.remove(alfajor);
    }
    
    public void removeProduto(Produto produto){
        listaProdutos.remove(produto);
    }
}
