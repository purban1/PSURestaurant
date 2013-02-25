package edu.wctc.distjava.blueproject.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Patrick Urban
 */
@ManagedBean(name = "search")
@RequestScoped
public class SearchOptionsBean {

    private String menuChoice = " ";
    public String searchPhrase = " ";
    /**
     * Creates a new instance of SearchOptionsBean
     */
    public SearchOptionsBean() {
    }

    public String returnDestinationPage(){
        return menuChoice;
    }
    
    public String returnSearchTextResults(){
        String searchItem="";
        if (!(this.getSearchPhrase().equals(" "))){
             searchItem = "You did a search for " + this.getSearchPhrase();
        }
        return searchItem;
    }
    
    /**
     * @return the menuChoice
     */
    public String getMenuChoice() {
        return menuChoice;
    }

    /**
     * @param menuchoice the menuChoice to set
     */
    public void setMenuChoice(String menuChoice) {
        if (!(menuChoice.equals(" "))){
//            this.menuChoice = "You made the choice of " + menuChoice;
            this.menuChoice = menuChoice.toLowerCase();
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
        System.out.println(searchPhrase.toLowerCase());
    }


    
}
