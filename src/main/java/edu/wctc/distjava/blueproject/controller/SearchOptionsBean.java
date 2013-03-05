package edu.wctc.distjava.blueproject.controller;

import edu.wctc.distjava.blueproject.model.Auctions;
import edu.wctc.distjava.blueproject.model.AuctionsEAO;
//import edu.wctc.distjava.blueproject.model.BidItems;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Patrick Urban
 */
@Named("search")
@SessionScoped
public class SearchOptionsBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private AuctionsEAO eao;
    
    private String auctionChoice;
    private String searchPhrase = "Smith";
    private final String DEFAULT_RADIO = "all";
    private List<Auctions> auctions = new ArrayList<Auctions>();

    /**
     * Creates a new instance of SearchOptionsBean
     */
    public SearchOptionsBean() {
    }

    public List<Auctions> getAuctions() {
        return auctions;
    }

    public void setAuctions(List<Auctions> auctions) {
        this.auctions = auctions;
    }

    public List<Auctions> returnAllAuctionItems() {
        
       if (this.auctionChoice.equals("all")){
            auctions = eao.getAllAuctions();
        } 
//        else if (this.getAuctionChoice().equals("0")) {
//            
//        }
//        } else if (this.getAuctionChoice().equals("50")) {
//            
//        }
//        } else if (this.getAuctionChoice().equals("100")) {
//            
//        }
//        List<AuctionItem> listMatch = new ArrayList<AuctionItem>();
//
//        if (auctionChoice.equals(DEFAULT_RADIO) || auctionChoice == null) {
//            for (AuctionItem b : list) {
//                listMatch.add(b);
//            }
//        } else {
//            for (AuctionItem b : list) {
//                if (b.getCategory().toLowerCase().equals(this.getAuctionChoice())) {
//                    listMatch.add(b);
//                }
//            }
//        }
        return auctions;
    }

//    public final String returnAuctionCategory() {
//        return auctionChoice.toUpperCase();
//    }
//
    /**
     * @return the auctionChoice
     */
    public String getAuctionChoice() {
        return auctionChoice;
    }

    /**
     * @param auctionChoice the auctionChoice to set
     */
    public void setAuctionChoice(String choice) {
        if (!(choice == null)) {
            this.auctionChoice = choice.toLowerCase();
        } else {
            this.auctionChoice = DEFAULT_RADIO;
        }
        this.setSearchPhrase("Jones");
    }

    /**
     * @return the searchPhrase
     */
    public String getSearchPhrase() {
        return searchPhrase;
    }

    /**
     * @param searchPhrase the searchPhrase to set
     */
    public void setSearchPhrase(String searchPhrase) {
        this.searchPhrase = searchPhrase;
        System.out.println(searchPhrase.toLowerCase());
    }
    
    
    
}
