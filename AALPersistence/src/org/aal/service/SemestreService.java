/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.service;

import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.aal.bases.AAlBaseService;
import org.aal.entities.Semestre;

/**
 * Clase que permite la persistencia de la entidad Estudiante
 * @author Bomlu
 * @version 1.0     Agosto 2012
 */
public class SemestreService extends AAlBaseService {
    /**.
     * Constructor
     */
    public SemestreService() {
        super();
    }
    public void persistSemestre(Semestre e){
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(e);
        tx.commit();
        em.close();
    }
    public List<Semestre> getAll(){
        EntityManager em = getEm();
        List<Semestre> semestreList =
                em.createNamedQuery("Semestre.getAll").getResultList();
        return semestreList;
    }
    public Semestre getById(Integer id){
        EntityManager em = getEm();
        Semestre semestre = (Semestre) em.createNamedQuery("Semestre.getById")
                .setParameter("SemestreId", id).getSingleResult();
        return semestre;
    }
    public void show(List<Semestre> semestreList){
        Iterator it = semestreList.iterator();
        while (it.hasNext()) {
            Semestre semestre = (Semestre) it.next();
            logger.info(semestre.toString());
        }
    }
    public Semestre getByFind(Integer id){
        EntityManager em = getEm();
        Semestre e = em.find(Semestre.class, id);
        return e;
    }
    public void show(Semestre s){
        logger.info(s.toString());
    }
    public List<Semestre> getByQuery(String statement){
        EntityManager em = getEm();
        List<Semestre> semestreList = em.createQuery(statement).getResultList();
        return semestreList;
    }
    //Modo 1
    public void updateName(Integer id, String nombre){
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Query query = em.createNamedQuery("Semestre.setNombre")
                .setParameter("SemestreId", id)
                .setParameter("SemestreNombre", nombre);
        query.executeUpdate();
        tx.commit();
    }
    // Modo 2
    public void updateNameByFind(Integer id, String nombre){
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Semestre s = em.find(Semestre.class, id);
        s.setNombre(nombre);
        em.merge(s);
        tx.commit();
    }
    public void removeSemestre(Semestre s){
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(s);
        tx.commit();
    }    
}
