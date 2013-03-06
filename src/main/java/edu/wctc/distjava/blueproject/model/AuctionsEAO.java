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

    public AuctionsEAO() {
    }

    public List<Auctions> getAllAuctions() {
        Query query = getEntityManager().createNamedQuery("Auctions.findAll");
        List<Auctions> auctionList = query.getResultList();

        return auctionList;

    }
    
//    public List<Auctions> getAuctionsByCategory(String cat) {
//        String theQuery = "SELECT a FROM Auctions a INNER JOIN a.categoryId c WHERE c.categoryID = ?1";
//        Query query = getEntityManager().createQuery(theQuery);
//        query.setParameter("1", Integer.parseInt(cat));
//        List<Auctions> auctionList = query.getResultList();
//
//        return auctionList;
//
//    }

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
