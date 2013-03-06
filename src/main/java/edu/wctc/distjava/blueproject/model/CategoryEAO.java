package edu.wctc.distjava.blueproject.model;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Patrick Urban
 */
@Named
@Stateless
public class CategoryEAO {
    
    @PersistenceContext(unitName = "blueprojectPU")
    private EntityManager em;

    public CategoryEAO(){
        
    }
    
     public List<Category> getAllCategories() {
        Query query = getEntityManager().createNamedQuery("Category.findAll");
        List<Category> categoryList = query.getResultList();

        return categoryList;

    }
     /**
     * Always use this in your code -- never reference the 'em' property because
     * JPA EntityManagers are loaded on demand.
     *     
     * @return an on demand object
     */
    public EntityManager getEntityManager() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
}
