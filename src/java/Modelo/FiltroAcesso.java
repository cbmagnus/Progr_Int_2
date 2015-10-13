package Modelo;


import Controle.ControladorMB;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter(filterName = "FiltroAcesso", urlPatterns = {"/faces/usuario.xhtml"})
public class FiltroAcesso implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        ControladorMB usuarioMB = (ControladorMB) req.getSession().getAttribute("usuarioMB");
        if (usuarioMB != null && usuarioMB.estaLogado()) {
            //encaminha para o recurso
            chain.doFilter(request, response);
        } else {
            //redireciona para pagina de login
            resp.sendRedirect(req.getContextPath() + "/faces/login.xhtml");
        }

    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

}
