


package controle;

import dao.DAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Administrador;
import modelo.Tutor;

@ManagedBean (name="novoTutor")
@ViewScoped
public class NovoTutor implements Serializable {
    private List<Tutor> tutores;
    private Tutor dono;
    private DAO<Tutor> dao;
    
    public NovoTutor(){
        dono = new Tutor();
        dao = new DAO(Administrador.class);
        
    }
    public void salvar(){
        dao.inserir(dono);
    }
    public List<Tutor> getTutores() {
        return tutores;
    }

    public void setTutores(List<Tutor> tutores) {
        this.tutores = tutores;
    }

    public Tutor getProprietario() {
        return dono;
    }

    public void setProprietario(Tutor propietario) {
        this.dono = propietario;
    }

    public DAO<Tutor> getDao() {
        return dao;
    }

    public void setDao(DAO<Tutor> dao) {
        this.dao = dao;
    }
    
    
    
    
    
}