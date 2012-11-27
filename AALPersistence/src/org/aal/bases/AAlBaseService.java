/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.bases;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Clase que inicializa los servicios de persistencia.
 * @author Migue
 * @version 1.0     Agosto 2012
 */
public class AAlBaseService extends AAlLog implements Serializable {
    
    protected EntityManagerFactory entityManagerFactory;
    protected EntityManager em;
    
    /*
     * Constructor
     */
    public AAlBaseService(){
        try {
            logger.debug("Inicia creación servicio persistencia");
            entityManagerFactory = Persistence.createEntityManagerFactory(AAlConstantes.PERSISTENT_UNIT, 
                    System.getProperties());
            em = entityManagerFactory.createEntityManager();
            logger.debug("Finaliza creación servicio persistencia");
        } catch (Throwable t) {
            logger.debug(AAlConstantes.ERROR_MSG + t.toString() + ":" + t.getMessage());
        }
    }

    /*
     * Getters y Setters
     */
    
    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }
    
    
    
}
