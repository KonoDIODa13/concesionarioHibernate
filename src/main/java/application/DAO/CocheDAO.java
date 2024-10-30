package application.DAO;

import application.Conexion.Conexion;
import application.Domain.Coche;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CocheDAO {
    private SessionFactory factory;
    private Session session;

    public CocheDAO() {
        Conexion.conexion();
        factory = Conexion.getFactory();
        session = Conexion.getSession();
    }

    public void desconectarBD() {
        factory.close();
        session.close();
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

    public Coche buscarCoche(String matricula) {
        Coche coche;
        coche = (Coche) session.get(Coche.class, matricula);
        return coche;
    }
    public List<Coche> getCoches() {
        return session.createQuery("from Coche").getResultList();
    }

}
