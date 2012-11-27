package org.aal.test;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.aal.entities.Estudiante;
import org.aal.entities.Semestre;
import org.apache.log4j.Logger;
/**
 *
 * @author Bomlu
 */
public class TestMain {
    //Variable para log
    //Declarar la variable tipo Logger que maneja los mensajes
    /**
 *
 * @author Bomlu
 */
    private static final Logger _log = Logger.getLogger(TestMain.class);

    public static void main(String[]  args) {  
        // BasicConfigurator.configure();
        _log.debug("Log Activado");

        Semestre s = new Semestre();
        s.setNombre("2012-B");
        Estudiante p = new Estudiante();
        p.setNombre("Jose Perez");
        p.setSemestre(s);
        //Direccion dir = new Direccion();
        //dir.setCiudad("Quito");
        // dir.setId(1);
        // List<Compra> cl = new ArrayList<Compra>();
        // cl.add(com1);
        // cl.add(com2);
   // Primera pregunta, relacion 1 a 1 entre CLIENTE y DIRECCION unidireccional
        //Cliente cli = new Cliente();
        //cli.setNombre("Pepe");
        //cli.setApellido("Cebolla");
        //cli.setDireccion(dir);
        // cli.setCompraList(cl);
  // Primera pregunta, relacion 1 a muchos entre CLIENTE y COMPRA bidireccional
        //Compra com1 = new Compra();
        //com1.setMonto(23.00);
        //com1.setCliente(cli);
       // Compra com2 = new Compra();
        //com2.setMonto(25.00);
        //com2.setCliente(cli);
TestMain demo = new TestMain();
       //demo.persist(dir);
       //demo.persist(cli);
       //demo.persist(com1);
       // demo.persist(com2);
        demo.persist(s);
        demo.persist(p);

    }
     public void persist (Object obj) {
    EntityManagerFactory emf = javax.persistence.
            Persistence.createEntityManagerFactory("AALPersistencePU");
    EntityManager em = emf.createEntityManager();
       em.getTransaction().begin();
     try {
            em.persist(obj);
            em.getTransaction().commit();
         }
    catch (Exception e) {
        e.printStackTrace();
        em.getTransaction().rollback();
    } finally {
        em.close();
        }
    }
}