package ExamplesNotForUse;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author Patrick Urban
 */

@Named
@Stateless
public class EmployeeEAO {

    @PersistenceContext(unitName = "blueprojectPU")
    private EntityManager em;

    public Employee getEmployeeByID(Object id) {
        return getEntityManager().find(Employee.class, id);
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