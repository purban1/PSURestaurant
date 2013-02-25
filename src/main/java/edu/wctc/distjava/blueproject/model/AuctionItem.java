package edu.wctc.distjava.blueproject.model;


/**
 * 
 * @author Patrick Urban
 */
public class AuctionItem {
    
    private String id;
    private String category;
    private String item;
    private String description;
    private String bidPrice;
    private String auctionEndDate;
    
    
    public AuctionItem(String id, String cat, String item, String descrip, 
            String price, String date){
        this.setId(id);
        this.setCategory(cat);
        this.setItem(item);
        this.setDescription(descrip);
        this.setBidPrice(price);
        this.setAuctionEndDate(date);
    }

    /**
     * @return the id
     */
    public final String getId() {
        return id;
    }

    /**
     * @return the category
     */
    public final String getCategory() {
        return category;
    }

    /**
     * @return the description
     */
    public final String getDescription() {
        return description;
    }

    /**
     * @return the bidPrice
     */
    public final String getBidPrice() {
        return bidPrice;
    }

    /**
     * @return the auctionEndDate
     */
    public final String getAuctionEndDate() {
        return auctionEndDate;
    }

    /**
     * @param id the id to set
     */
    public final void setId(String id) {
        this.id = id;
    }

    /**
     * @param category the category to set
     */
    public final void setCategory(String category) {
        this.category = category;
    }

    /**
     * @param description the description to set
     */
    public final void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param bidPrice the bidPrice to set
     */
    public final void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * @param auctionEndDate the auctionEndDate to set
     */
    public final void setAuctionEndDate(String auctionEndDate) {
        this.auctionEndDate = auctionEndDate;
    }

    /**
     * @return the item
     */
    public final String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public final void setItem(String item) {
        this.item = item;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (this.category != null ? this.category.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AuctionItem other = (AuctionItem) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if ((this.category == null) ? (other.category != null) : !this.category.equals(other.category)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "AuctionItem{" + "id=" + id + ", category=" + category + 
                ", item=" + item + ", description=" + description + ", bidPrice=" +
                bidPrice + ", auctionEndDate=" + auctionEndDate + '}';
    }
    
    
    
}
