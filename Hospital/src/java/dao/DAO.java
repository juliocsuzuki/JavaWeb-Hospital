/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaQuery;
import util.JPAUtil;


public class DAO <T> implements Serializable {
    private final Class<T> classe;
    EntityManager manager;
    public DAO(Class<T> classe){
    this.classe = classe;
}
 public void inserir(T objeto){
     manager = JPAUtil.getEntityManager();
     EntityTransaction tx = manager.getTransaction();
     tx.begin();
     manager.persist(objeto);
     tx.commit();
 }   
 public List<T> listarTodos(){
     manager = JPAUtil.getEntityManager();
     CriteriaQuery<T> query = manager.getCriteriaBuilder().createQuery(classe);
     query.select(query.from(classe));
     List<T> lista = manager.createQuery(query).getResultList();
     manager.close();
     return lista;
 }
}
