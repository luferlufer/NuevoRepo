/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.entities;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

/**
 *
 * @author Migue
 */
@Entity
public class Compra implements Serializable {
    /**
 *
 * @see serialVersionUID
 */
    private static final long serialVersionUID = 1L;
    /**
 *
 * @id
 */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
       /**
 *
 * @id
 */
    private Date fecha;
       /**
 *
 * @id
 */
    private Double monto;    
    //@JoinColumn (name = "ID", referencedColumnName = "ID" )
       /**
 *
 * @id
 */
    @ManyToOne (optional = false)
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
     //  Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.aal.entities.Compra[ id=" + id + " ]";
    }
}
