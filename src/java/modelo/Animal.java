package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Animal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 30)
    String name;
    @Column(length = 30)
    String proprietario;
    @Column(length = 30)
    String especi;
    @Column(length = 30)
    String raca;

    public Animal(String nome, String proprietario, String especie, String raca) {
        this.name = nome;
        this.proprietario = proprietario;
        this.especi = especie;
        this.raca = raca;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getEspeci() {
        return especi;
    }

    public void setEspeci(String especi) {
        this.especi = especi;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.proprietario);
        hash = 29 * hash + Objects.hashCode(this.especi);
        hash = 29 * hash + Objects.hashCode(this.raca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.proprietario, other.proprietario)) {
            return false;
        }
        if (!Objects.equals(this.especi, other.especi)) {
            return false;
        }
        if (!Objects.equals(this.raca, other.raca)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + name + ", proprietario=" + proprietario + ", especie=" + especi + ", raca=" + raca + '}';
    }
    private Integer id;
    @Column(length = 30)
    private String especie;
    @Column(length = 30)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "tutor")
    private Tutor tutor;
    
    public Animal(){
        this.name = "";
        this.especi = "";
        this.tutor = new Tutor();
    }
    
    public Animal(String nome, Tutor tutor){
        this.name = nome;
        this.especi = especi;
        this.tutor = tutor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /*public String getEspeci() {
        return especi;
    }

    //public void setEspeci(String especie) {
        this.especi = especie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }*/
}

    
    

   
    
 