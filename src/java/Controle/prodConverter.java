package Controle;


import Modelo.Produto;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value = "prodConverter")
public class prodConverter implements Converter {
 
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null) {
            return null;
        }
        ProducaoMB prodMB = context.getApplication().evaluateExpressionGet(context, "#{ProducaoMB}",
                        ProducaoMB.class);
        Produto prod = prodMB.findProdutoByNome(value);
        return prod;
    }
 
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        String string = null;
        if (value instanceof Produto) {
            string = ((Produto) value).getProduto();
        }
        return string;
    }
 
}