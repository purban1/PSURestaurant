package edu.wctc.distjava.blueproject.controller;

import edu.wctc.distjava.blueproject.model.Auctions;
import edu.wctc.distjava.blueproject.model.AuctionsEAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Patrick Urban
 */
@Named("auction")
@SessionScoped
public class AuctionBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @Inject
    private AuctionsEAO eao;
    private String noPicture = "no_picture.jpg";
    private String imageDirectory;
    private String auctionChoice;
    private Date displayDate;

    private String searchPhrase = "";
    private Auctions selectedAuction;
    private final String DEFAULT_RADIO = "All";
    private List<Auctions> auctions = new ArrayList<Auctions>();

    /**
     * Creates a new instance of SearchOptionsBean
     */
    public AuctionBean() {
    }

    public List<Auctions> getAuctions() {
        return auctions;
    }

    public void setAuctions(List<Auctions> auctions) {
        this.auctions = auctions;
    }

    public List<Auctions> returnAuctionItems() {

        if (this.auctionChoice.equals("All")) {
            auctions = eao.getAllAuctions();
        }
//        else {
//            auctions = eao.getAuctionsByCategory(this.getAuctionChoice());
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
            this.auctionChoice = choice.trim();
        } else {
            this.auctionChoice = DEFAULT_RADIO;
        }
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
    }

    /**
     * @return the selectedAuction
     */
    public Auctions getSelectedAuction() {
        return selectedAuction;

    }

    /**
     * @param selectedAuction the selectedAuction to set
     */
    public void setSelectedAuction(Auctions selectedAuction) {
        this.selectedAuction = selectedAuction;
    }

    /**
     * Generate a list of image names from the database and return a default
     * value if all values are null in the Database
     *
     * @return a List containing pictures for an auction item
     */
    public List<String> getPictureList() {
        List<String> pictures = new ArrayList<String>();

        // Don't do this if selectedAuctions is currently null
        if (!(selectedAuction == null)) {

            if (!(selectedAuction.getItemId().getPicture1() == null)) {
                pictures.add(selectedAuction.getItemId().getPicture1());
            }
            if (!(selectedAuction.getItemId().getPicture2() == null)) {
                pictures.add(selectedAuction.getItemId().getPicture2());
            }
            if (!(selectedAuction.getItemId().getPicture3() == null)) {
                pictures.add(selectedAuction.getItemId().getPicture3());
            }
            if (!(selectedAuction.getItemId().getPicture4() == null)) {
                pictures.add(selectedAuction.getItemId().getPicture4());
            }
            if (!(selectedAuction.getItemId().getPicture5() == null)) {
                pictures.add(selectedAuction.getItemId().getPicture5());
            }
            if (pictures.size() == 0) {
                pictures.add(noPicture);
                setImageDirectory("images/auctions");
            } else {
                setImageDirectory("images/auctions/" + selectedAuction.getAuctionId());
                System.out.println(selectedAuction.getAuctionStartDate().toString());

            }

        }
        return pictures;
    }

    /**
     * @return the imageDirectory
     */
    public String getImageDirectory() {
        return imageDirectory;
    }

    /**
     * @param imageDirectory the imageDirectory to set
     */
    public void setImageDirectory(String imageDirectory) {
        this.imageDirectory = imageDirectory;
    }

}
