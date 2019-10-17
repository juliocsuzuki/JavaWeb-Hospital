package util;
import dao.DAO;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import modelo.Tutor;

@FacesConverter(value = "cursoConverter")
public class ConverterTutor implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String nome) {
        Tutor temp = null;
        DAO<Tutor> dao = new DAO(Tutor.class);
        try {
            temp = dao.buscarPorNome(nome);
	} catch (Exception e) {
            throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro","Selecione um Tutor"));
	}
 	return temp;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object obj) {
        if (obj instanceof Tutor){
            Tutor c = (Tutor)obj;
            return c.getNome();
        }
        return "";
    }
    
}