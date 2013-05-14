
package br.com.simweb2.util;

import javax.faces.context.FacesContext;
import org.hibernate.Session;

public class FacesContextUtil {
    
    private static final String HIBERNATE_SESSION = "hibernate_session";
    
    // Vai setar na requisição no Hibernate
    public static void setRequestSession(Session session){
        FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put(HIBERNATE_SESSION, session);
    }
    
    
    public static Session geRequestSession() {
        return (Session)FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get(HIBERNATE_SESSION);
    }
    
    
    
}
