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
import org.aal.entities.Estudiante;

/**.
 * Clase que permite la persistencia de la entidad Estudiante
 * @author Bomlu
 * @version 1.0     Agosto 2012
 */
public class EstudianteService extends AAlBaseService {   
    /**
     * @EstudianteService
     */
    public EstudianteService() {
        super();
    }
    public void persistEstudiante(Estudiante e){
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(e);
        tx.commit();
        em.close();
    }
    public List<Estudiante> getAll(){
        EntityManager em = getEm();
        List<Estudiante> estudianteList
                = em.createNamedQuery("Estudiante.getAll").getResultList();
        return estudianteList;
    }
    public Estudiante getById(Integer id){
        EntityManager em = getEm();
        Estudiante estudiante
                = (Estudiante) em.createNamedQuery("Estudiante.getById")
                .setParameter("EstudianteId", id).getSingleResult();
        return estudiante;
    }
    public void show(List<Estudiante> estudianteList){
        Iterator it = estudianteList.iterator();
        while (it.hasNext()) {
            Estudiante estudiante = (Estudiante) it.next();
            logger.info(estudiante.toString());
            logger.info(estudiante.getSemestre().toString());
        }
    }
    public Estudiante getByFind(Integer id){
        EntityManager em = getEm();
        Estudiante e = em.find(Estudiante.class, id);
        return e;
    }
    public void show(Estudiante e){
        logger.info(e.toString());
        logger.info(e.getSemestre().toString());
    }
    public List<Estudiante> getByQuery(String statement){
        EntityManager em = getEm();
        List<Estudiante> estudianteList
                = em.createQuery(statement).getResultList();
        return estudianteList;
    }
    //Modo 1
    public void updateName(Integer id, String nombre){
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Query query = em.createNamedQuery("Estudiante.setNombre")
                .setParameter("EstudianteId", id)
                .setParameter("EstudianteNombre", nombre);
        query.executeUpdate();
        tx.commit();
    }
    // Modo 2
    public void updateNameByFind(Integer id, String nombre){
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Estudiante e = em.find(Estudiante.class, id);
        e.setNombre(nombre);
        em.merge(e);
        tx.commit();
    }
    public List<Estudiante> getByFK(Integer fk){
        EntityManager em = getEm();
        List<Estudiante> estudianteList
                = em.createQuery("FROM Estudiante WHERE ids = "
                + fk.toString()).getResultList();
        return estudianteList;
    }
    public void removeEstudiante(Estudiante e){
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(e);
        tx.commit();
    }
}
