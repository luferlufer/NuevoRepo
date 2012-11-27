/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.bases;

/**
 *Interface de acceso a Datos
 * @author Migue
 * @version 1.0 Sept 2012
 */
public interface AAlDAOManager {
    /**
     * Método genérico para realizar insert de un Entity
     * @param Entity
     * @return Entity
     */
    Object persistEntity(Object entity);
    
    
    Object getEntity(Integer id, Object entity);
    
    void updateEntity(Object entity);
    
    
}



