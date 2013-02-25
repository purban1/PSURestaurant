package edu.wctc.distjava.blueproject.controller;

import edu.wctc.distjava.blueproject.model.AuctionItem;
import edu.wctc.distjava.blueproject.model.BidItems;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Patrick Urban
 */
@ManagedBean(name = "search")
@SessionScoped
public class SearchOptionsBean {

    private String menuChoice = " ";
    private String searchPhrase = " ";

    /**
     * Creates a new instance of SearchOptionsBean
     */
    public SearchOptionsBean() {
    }

    public final List<AuctionItem> returnItemsForPage() {
        BidItems items = new BidItems();
        List<AuctionItem> list = items.createAuctionList();
        List<AuctionItem> listMatch = new ArrayList<AuctionItem>();

        if (menuChoice.equals("all")) {
            for (AuctionItem b : list) {
                listMatch.add(b);
            }
        } else {
            for (AuctionItem b : list) {
                if (b.getCategory().toLowerCase().equals(this.getMenuChoice())) {
                    listMatch.add(b);
                }
            }
        }
        return listMatch;
    }

    public final String returnAuctionCategory() {
        return menuChoice.toUpperCase();
    }

    /**
     * @return the menuChoice
     */
    public final String getMenuChoice() {
        return menuChoice;
    }

    /**
     * @param menuchoice the menuChoice to set
     */
    public final void setMenuChoice(String menuChoice) {
        if (!(menuChoice.equals(" "))) {
//            this.menuChoice = "You made the choice of " + menuChoice;
            this.menuChoice = menuChoice.toLowerCase();
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
