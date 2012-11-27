/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.service;

import java.io.Serializable;
import javax.persistence.EntityTransaction;
import org.aal.bases.AAlBaseService;
import org.aal.bases.AAlConstantes;
import org.aal.bases.AAlDAOManager;

/**
 *
 * @author Bomlu
 */
public class AAlDAOService extends AAlBaseService
implements AAlDAOManager, Serializable {

 // Siempre se necesita un constructor para instanciar las clases de mas arriba
   /*Constructor*/
       /**
 *
 * @id
 */
    public AAlDAOService() {
        super();
    }
    /**.
     * Método genérico para insert de una Entity
     * @param entity que se desea insertar
     * @return Entity persistida
     */
    @Override
    public Object persistEntity(Object entity) {
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        logger.debug(AAlConstantes.PERSIST + entity.toString());
        em.persist(entity);
   // Para obligar a hacer la persistencia en la base de datos y no en un caché
        em.flush();
        trans.commit();
        //em.close();
        return entity;
    }

    @Override
    public Object getEntity(Integer id, Object entity) {
        logger.debug(AAlConstantes.GET + id.toString());
        Object obj = em.find(entity.getClass(), id);
        return obj;
    }

    @Override
    public void updateEntity(Object entity) {
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        logger.debug(AAlConstantes.UPDATE + entity.toString());
        em.merge(entity);
        trans.commit();
    }   
}
