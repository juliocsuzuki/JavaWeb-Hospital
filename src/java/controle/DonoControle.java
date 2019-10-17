package controle;

import dao.DAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Tutor;

@ManagedBean (name="donoControle")
@ViewScoped
public class DonoControle {
    private List<Tutor> donos;
    private Tutor donoSelecionado;
    private DAO<Tutor> dao;
    
    public DonoControle(){
        donoSelecionado = new Tutor();
        dao = new DAO(Tutor.class);
        donos = dao.listarTodos();
    }

    public List<Tutor> getDonos() {
        return donos;
    }

    public void setDonos(List<Tutor> donos) {
        this.donos = donos;
    }

    public Tutor getDonoSelecionado() {
        return donoSelecionado;
    }

    public void setDonoSelecionado(Tutor donoSelecionado) {
        this.donoSelecionado = donoSelecionado;
    }

    public DAO<Tutor> getDao() {
        return dao;
    }

    public void setDao(DAO<Tutor> dao) {
        this.dao = dao;
    }
    
    
    

    
}