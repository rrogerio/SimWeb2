
package br.com.simweb2.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import org.hibernate.Session;

// Utilizado para controle de abertura e fechamento de sessão com o banco de dados

public class PhaseListenerSimWeb2 implements PhaseListener{

    
    
    //Antes da Fase
    @Override
    public void beforePhase(PhaseEvent fase) {
        System.out.println("Rogerio estou Antes da Fase: "+fase.getPhaseId());
        if (fase.getPhaseId().equals(PhaseId.RESTORE_VIEW)) {         
            Session session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            FacesContextUtil.setRequestSession(session);
        }
    }
    
    //Depois da Fase
    @Override
    public void afterPhase(PhaseEvent fase) {
        
        System.out.println("Rogerio estou Depois da Fase: "+fase.getPhaseId());
        if (fase.getPhaseId().equals(PhaseId.RENDER_RESPONSE)) {
            Session session = FacesContextUtil.geRequestSession();
            try {
                session.getTransaction().commit();
            } catch (Exception e) {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();                    
                }
            }finally{
                session.close();
            }
        }
    }

    

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
