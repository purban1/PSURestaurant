package edu.wctc.distjava.blueproject.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Patrick Urban
 */
@Named
@Stateless
public class AuctionsEAO {
    
    @PersistenceContext(unitName = "blueprojectPU")
    private EntityManager em;

    public AuctionsEAO(){
        
    }
    
    public List<Auctions> getAllAuctions() {
//        List<Auctions> auctions = new ArrayList<Auctions>();
//        
//        Items items = new Items();
        
//        TypedQuery<Auctions> query = getEntityManager().createNamedQuery( "Auctions.findAll", Auctions.class);
        Query query = getEntityManager().createNamedQuery("Auctions.findAll");
        List<Auctions> auctions = query.getResultList();
        
//        System.out.println(auction.toString());
//        System.out.println(items.toString());
        
        return auctions;
        
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
