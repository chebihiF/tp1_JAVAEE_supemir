package supemir.irm.tp1.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import supemir.irm.tp1.entities.Product;

public class HibernateUtil {
    private static final SessionFactory FACTORY;

    static{
        FACTORY = new Configuration().configure()
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();
    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }
}
