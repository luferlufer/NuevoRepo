/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.entities;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 * @author Bomlu
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Semestre.getAll", query = "FROM Semestre"),
    @NamedQuery(name = "Semestre.getById", query = "FROM Semestre WHERE id = :SemestreId"),
    //NamedQuery para actualización
    @NamedQuery(name= "Semestre.setNombre", 
        query = "UPDATE Semestre s SET s.nombre= :SemestreNombre WHERE s.id= :SemestreId")
       
})
public class Semestre implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ids;
    private String nombre;
    
    // Establecer relación con Estudiante
    // Cascade, operaciones en cascada
    // mappedBy, variable de vínculo entre Semestre y estudiante
    // Lista de objetos, por la relación uno a muchos
    @OneToMany(cascade= CascadeType.ALL, mappedBy="semestre", fetch= FetchType.LAZY)
    private List<Estudiante> estudianteList;

    public List<Estudiante> getEstudianteList() {
        return estudianteList;
    }

    public void setEstudianteList(List<Estudiante> estudianteList) {
        this.estudianteList = estudianteList;
    }
    
    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        Integer oldIds = this.ids;
        this.ids = ids;
        changeSupport.firePropertyChange("ids", oldIds, ids);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ids != null ? ids.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semestre)) {
            return false;
        }
        Semestre other = (Semestre) object;
        if ((this.ids == null && other.ids != null) || (this.ids != null && !this.ids.equals(other.ids))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "org.aal.entities.Semestre[ id=" + ids + " ; nombre= " + nombre + " ]";
        return nombre;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
