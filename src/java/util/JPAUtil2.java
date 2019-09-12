package util;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
public class JPAUtil2 {
    private static final EntityManagerFactory FACTORY;
    
    static{
        FACTORY = Persistence.createEntityManagerFactory("HospitalPU");
    }
    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }
}
