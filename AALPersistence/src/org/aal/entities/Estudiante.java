/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.entities;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.*;
import sun.util.calendar.CalendarDate;

/**
 *
 * @author Bomlu
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Estudiante.getAll", query = "FROM Estudiante"),
    @NamedQuery(name = "Estudiante.getById", query = "FROM Estudiante WHERE id = :EstudianteId"),
    //NamedQuery para actualización
    @NamedQuery(name= "Estudiante.setNombre", 
        query = "UPDATE Estudiante e SET e.nombre= :EstudianteNombre WHERE e.id= :EstudianteId")
       
})
public class Estudiante extends CalendarDate implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String  nombre;
    private String  Apellido;
    private String  FechaNacimiento;
    private Integer NumeroCelular;
    private String LugarNacimiento;
    
    // Establecer relación con Semestre
    // Many Estudiante reference one Semestre
    // FetchType
    // Lazy, solo cuando le pido el semestre consulta la base de datos por semestre (Bajo demanda)
    // Eager, (De forma inmediata)
    // La clave foránea constituye todo un objeto
    @JoinColumn(name="IDS", referencedColumnName="ids")
    @ManyToOne(optional=false, fetch= FetchType.LAZY)
    private Semestre semestre;

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public String getLugarNacimiento() {
        return LugarNacimiento;
    }

    public void setLugarNacimiento(String LugarNacimiento) {
        this.LugarNacimiento = LugarNacimiento;
    }

    public Integer getNumeroCelular() {
        return NumeroCelular;
    }

    public void setNumeroCelular(Integer NumeroCelular) {
        this.NumeroCelular = NumeroCelular;
    }

    public void setSemestre(Semestre semestre) {
        Semestre oldSemestre = this.semestre;
        this.semestre = semestre;
        changeSupport.firePropertyChange("semestre", oldSemestre, semestre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + id + "     " + nombre +"    " +Apellido+"    " + this.getSemestre() + "    "+FechaNacimiento+"   "+LugarNacimiento+"   "+NumeroCelular;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
