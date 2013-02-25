/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.distjava.blueproject.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author production
 */
public class BidItems {
 
    
    public BidItems(){
        
    }
    
    public List<AuctionItem> createAuctionList(){
        List<AuctionItem> items = new ArrayList<AuctionItem>();
        
        items.add(new AuctionItem("1", "Electronics", "Blu-Ray Player", 
                "Samsung Blu-Ray player with Internet capabilities", "50.00", "3/15/2013"));
        items.add(new AuctionItem("2", "Electronics", "iPod Touch", 
                "Apple iPod Touch 32GB", "175.00", "3/15/2013"));
        items.add(new AuctionItem("3", "Electronics", "USB Drive", 
                "Western Digital 1TB USB Drive", "55.00", "3/15/2013"));
        items.add(new AuctionItem("4", "Retail", "Gift Card", 
                "Kohl's Department Store", "75.00", "3/15/2013"));
        items.add(new AuctionItem("5", "Retail", "Waffle iron", 
                "Kitchen Aid 4 Waffle, Waffle Iron", "65.00", "3/15/2013"));
        items.add(new AuctionItem("6", "Retail", "Famous Footware Discount", 
                "Famous Footware 50% off Total off total purchase up to $200 max purchase", 
                "30.00", "3/15/2013"));
        items.add(new AuctionItem("7", "Dining", "Domino's Gift Card", 
                "$50.00 Domino's Gift Card", "20.00", "3/15/2013"));
        items.add(new AuctionItem("8", "Dining", "Harry Joe's Diner", 
                "Two $25.00 Gift certificates to eat at Harry Joe's Diner", 
                "15.00", "3/15/2013"));
        
        return items;
    }
}
