package supemir.irm.tp1.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory FACTORY;

    static{
        FACTORY = new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }
}
