
package br.com.simweb2.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateUtil {
    
    private static final SessionFactory sessionfactory;
    public static final String HIBERNATE_SESSION = "hibernate_session";
    
    
    static{
        try {
             System.out.println("Tentando Configurar uma sessionF");
             Configuration configuration = new Configuration().configure();
             ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
             sessionfactory = configuration.buildSessionFactory(serviceRegistry);
             
             System.out.println("Rogerio Session factory criada corretamente ");
          
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao iniciar a sessionF" + e); 
            throw new ExceptionInInitializerError(e);
        }
        
        
    }

    public static SessionFactory getSessionfactory() {
        return sessionfactory;
    }
    
}
