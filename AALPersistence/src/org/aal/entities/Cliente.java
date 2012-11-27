/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author lufer
 */
@Entity
public class Cliente implements Serializable {
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
 * @see nombre
 */
    private String nombre;
    /**
 *
 * @see apellido
 */
    private String apellido;
    // @JoinColumn(name="ID", referencedColumnName="ID")
    /**
 *
 * @OneToOne
 */
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Direccion direccion;
 /**
 *
 * @OneToMany
 */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Compra> compraList;

    public List<Compra> getCompraList() {
        return compraList;
    }

    public void setCompraList(List<Compra> compraList) {
        this.compraList = compraList;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
 // Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "org.aal.entities.Cliente[ id=" + id + " ]";
    }
}
