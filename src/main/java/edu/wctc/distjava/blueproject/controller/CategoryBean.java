/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.distjava.blueproject.controller;

import edu.wctc.distjava.blueproject.model.Auctions;
import edu.wctc.distjava.blueproject.model.AuctionsEAO;
import edu.wctc.distjava.blueproject.model.Category;
import edu.wctc.distjava.blueproject.model.CategoryEAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author production
 */
@Named(value = "categoryBean")
@SessionScoped
public class CategoryBean implements Serializable{

    private static final long serialVersionUID = 1L;
    @Inject
    private CategoryEAO eao;
    private List<Category> categories = new ArrayList<Category>();
    
    public CategoryBean() {
    }
    
    public List<Category> returnAllAuctionItems() {

        categories = eao.getAllCategories();
        
        return categories;
    }
}
