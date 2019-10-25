package net.nguflo.utils;
 
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
 
public class HibernateUtil {
  private static SessionFactory sessionFactory = buildSessionFactory();
 
  private static SessionFactory buildSessionFactory() {
    Configuration config = new Configuration().configure();
    StandardServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
    sessionFactory = config.buildSessionFactory(sr);
    return sessionFactory;
  }

  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }
 
  public static void shutdown() {
    getSessionFactory().close();
  }
}
