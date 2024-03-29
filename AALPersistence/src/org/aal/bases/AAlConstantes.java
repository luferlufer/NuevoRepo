/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.bases;

import java.io.Serializable;

/**.
 * Clase que permite definir constantes para la aplicación
 * @author Migue
 * @version 1.0     Agosto 2012
 */
public class AAlConstantes extends AAlLog implements Serializable {
 /**
 *
 * @see PERSISTENT_UNIT
 *
 */
    public static final String PERSISTENT_UNIT = "AALPersistencePU";
     /**
 *
 * @see PERSISTENT_UNIT
 *
 */
    public static final String ERROR_MSG = "AAl-Persistlib-ERROR: ";
     /**
 *
 * @see PERSIST
 *
 */
    public static final String PERSIST = "AAl-Persistlib-PERSISTENCIA: ";
     /**
 *
 * @see GET
 *
 */
    public static final String GET = "AAL-Persistlib-GET: ";
     /**
 *
 * @see UPDATE
 *
 */
    public static final String UPDATE = "AAL-Persistlib-UDATE: ";
}
