package application.Conexion;

import application.Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Conexion {
    static SessionFactory factory = null;
    static Session session = null;

    public static void conexion() {
        factory = HibernateUtil.getSessionFactory();
        session = HibernateUtil.getSession();
    }

    public static void desconectar() {
        factory.close();
        session.close();
    }

    public static SessionFactory getFactory() {
        return factory;
    }

    public static Session getSession() {
        return session;
    }
}
