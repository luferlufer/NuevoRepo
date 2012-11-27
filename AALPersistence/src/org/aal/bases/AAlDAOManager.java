/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.bases;

/**.
 *Interface de acceso a Datos
 * @author lufer
 * @version 1.0 Sept 2012
 */
public interface AAlDAOManager {
    /**.
     * Método genérico para realizar insert de un Entity
     * @param entity
     * @return Object
     */
    Object persistEntity(Object entity);
     /**.
     * Método genérico para realizar insert de un Entity
     * @param entity
     * @param id
     * @return object
     */
    Object getEntity(Integer id, Object entity);
     /**.
     * Método genérico para realizar insert de un Entity
     * @param  entity    *
     */
    void updateEntity(Object entity);
}



