package Controle;


import Modelo.Alfajor;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value = "alfaConverter")
public class alfaConverter implements Converter {
 
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null) {
            return null;
        }
        ControladorMB controlMB = context.getApplication().evaluateExpressionGet(context, "#{ControladorMB}",
                        ControladorMB.class);
        Alfajor alfa = controlMB.findAlfaByNome(value);
        return alfa;
    }
 
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        String string = null;
        if (value instanceof Alfajor) {
            string = ((Alfajor) value).getTipoAlfajor();
        }
        return string;
    }
 
}