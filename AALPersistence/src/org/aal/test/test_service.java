/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.test;

import java.util.List;
import org.aal.entities.Estudiante;
import org.aal.service.EstudianteService;

/**
 *
 * @author Bomlu
 */
public class test_service {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Estudiante e = new Estudiante();
        // Semestre s = new Semestre();

        // s.setIds(6);
        // e.setNombre("Alumno P");
        //e.setSemestre(s);

        EstudianteService es = new EstudianteService();
        
        //es.persistEstudiante(e);
        //EstudianteService es = new EstudianteService();
        // GetAll
        List<Estudiante> le = es.getAll();
        es.show(le);
        //GetById
        Estudiante e = es.getById(15);
        es.show(e);
        //getByFind
        Estudiante e2 = es.getByFind(17);
        es.show(e2);
        //getByQuery
        String s = "FROM Estudiante WHERE id >= 3 AND id <= 5";
        List<Estudiante> estudianteList2 = es.getByQuery(s);
        es.show(estudianteList2);
        // PRUEBA DE UPDATE ESTUDIANTE EN MODO 1
        //es.updateName(3, "Actualizacion modo 1");
        // PRUEBA DE UPDATE ESTUDIANTE EN MODO 2
        //es.updateNameByFind(4, "Actualizacion modo 2");
        // SemestreService ss = new SemestreService();
        // PRUEBA DE UPDATE SEMESTRE EN MODO 1
        //ss.updateName(1, "Nombre actualizado modo 1");
        // PRUEBA DE UPDATE ESTUDIANTE EN MODO 2
        //ss.updateNameByFind(5, "Nombre actualizado modo 2");
        // Persistencia con DAOService
        //Estudiante e = new Estudiante();
        //e.setNombre("NombreEstudianteDAO");
        //Semestre s = new Semestre();
        //s.setNombre("NombreSemestreDAO");
        //AAlDAOService ds = new AAlDAOService();
        // PROBAR PERSISTENCIA
        //ds.persistEntity(s);
        //e.setSemestre(s);
        //ds.persistEntity(e);
        //PROBAR GET
        //Estudiante e = new Estudiante();      
        //e = (Estudiante) ds.getEntity(6, e);
        //System.out.println(e.toString());
        //        Semestre s = new Semestre();
        //        s = (Semestre) ds.getEntity(2, s);
        //        System.out.println(s.toString());
        //PROBAR UPDATE
        //Estudiante e = new Estudiante();
        //        e = (Estudiante) ds.getEntity(6, e);
        //System.out.println(e.toString());
        //e.setNombre("Nombre actualizado 1");
        //ds.updateEntity(e);
        //        e = (Estudiante) ds.getEntity(6, e);
        //        System.out.println(e.toString());
        //        Semestre s1 = new Semestre();
        //        s1 = (Semestre) ds.getEntity(2, s1);
        //        System.out.println(s1.toString());
        //        s1.setNombre("Semestre actualizado 1");
        //        ds.updateEntity(s1);
        ////        Probar persistencia
        //        s1 = (Semestre) ds.getEntity(2, s1);
        //        System.out.println(s1.toString());
        


    }
}
