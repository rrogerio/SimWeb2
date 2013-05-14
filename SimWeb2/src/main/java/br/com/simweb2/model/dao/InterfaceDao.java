/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simweb2.model.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author 2r.rogerio
 */
public interface InterfaceDao<T> {

       void save (T entity);
       void update(T entity);
       void remove(T entity);
       void marge(T entity);
       T getEntity(Serializable id);
       T getEntityByDetachedCriteria(DetachedCriteria criteria);
       List<T> getEntities();
       List<T> getListByDetachedCriteria(DetachedCriteria criteria);
       

    
       
}
