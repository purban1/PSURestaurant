package edu.wctc.distjava.blueproject.controller;

import edu.wctc.distjava.blueproject.model.AuctionItem;
import edu.wctc.distjava.blueproject.model.BidItems;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Patrick Urban
 */
@ManagedBean(name = "search")
@SessionScoped
public class SearchOptionsBean implements Serializable {

    private String auctionChoice;
    private String searchPhrase = " ";
    private final String DEFAULT_RADIO = "all";

    /**
     * Creates a new instance of SearchOptionsBean
     */
    public SearchOptionsBean() {
    }

    public final List<AuctionItem> returnItemsForPage() {
        BidItems items = new BidItems();
        List<AuctionItem> list = items.createAuctionList();
        List<AuctionItem> listMatch = new ArrayList<AuctionItem>();

        if (auctionChoice.equals(DEFAULT_RADIO) || auctionChoice == null) {
            for (AuctionItem b : list) {
                listMatch.add(b);
            }
        } else {
            for (AuctionItem b : list) {
                if (b.getCategory().toLowerCase().equals(this.getAuctionChoice())) {
                    listMatch.add(b);
                }
            }
        }
        return listMatch;
    }

    public final String returnAuctionCategory() {
        return auctionChoice.toUpperCase();
    }

    /**
     * @return the auctionChoice
     */
    public final String getAuctionChoice() {
        return auctionChoice;
    }

    /**
     * @param auctionChoice the auctionChoice to set
     */
    public final void setAuctionChoice(String auctionChoice) {
        if (!(auctionChoice == null)) {
            this.auctionChoice = auctionChoice.toLowerCase();
        } else {
            this.auctionChoice = DEFAULT_RADIO;
        }
    }

    /**
     * @return the searchPhrase
     */
    public final String getSearchPhrase() {
        return searchPhrase;
    }

    /**
     * @param searchPhrase the searchPhrase to set
     */
    public final void setSearchPhrase(String searchPhrase) {
        this.searchPhrase = searchPhrase;
        System.out.println(searchPhrase.toLowerCase());
    }
    
    
    
}
