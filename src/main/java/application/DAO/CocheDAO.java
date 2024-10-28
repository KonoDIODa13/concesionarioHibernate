package application.DAO;

import application.Conexion.Conexion;
import application.Domain.Coche;
import application.Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class CocheDAO {
    //private SessionFactory factory;
    private Session session;

    public CocheDAO() {
        // factory = Conexion.getFactory();
        session = Conexion.getSession();
    }

    public void conectarBD() {
        Conexion.conexion();
    }

    public void desconectarBD() {
        Conexion.desconectar();
    }

    public void insertarCoche(Coche coche) {
        session.beginTransaction();
        session.save(coche);
        session.getTransaction().commit();
    }

    public void modificarCoche(Coche coche) {
        session.beginTransaction();
        session.update(coche);
        session.getTransaction().commit();
    }

    public void eliminarCoche(Coche coche) {
        session.beginTransaction();
        session.delete(coche);
        session.getTransaction().commit();
    }

    /*
    public Coche buscarCoche(String matricula) {
        Coche coche;
        coche = (Coche) session.get(Coche.class, matricula);
        return coche;
    }
    */
    public List<Coche> getCoches() {
        List<Coche> listaCoches = session.createQuery("from Coche").getResultList();
        return listaCoches;
    }

}
