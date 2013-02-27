package edu.wctc.distjava.blueproject.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Patrick Urban
 */
@ManagedBean(name="club")
@RequestScoped
public class ClubInfoBean implements Serializable{
    
    public String DONATE = "If you would prefer to make a donation to the " +
            "club instead of participating in an auction, please click the "
            + "donate button below.";
    public String ABOUT = "The BIT Connections Club promotes WCTC students " +
            "who are motivated to share and expand upon their information " +
            "technology skills in a setting of which they can get involved " +
            "and apply the skills from the classroom into the real world. " +
            "The BIT Club members actively participate in service learning " +
            "projects, emerging technology exploration, aspects of global " +
            "business technology and professional development opportunities. " +
            "This innovative club is part of the Business Information Technology " +
            "department and welcomes any WCTC student interested in gaining " +
            "additional knowledge, valuable real world experience and experience " +
            "in the ever-changing world of information technology. The BIT " +
            "Connections Club meets twice a month in the L Building and " +
            "our meeting times are announced via Blackboard and WCTC " +
            "Portal announcements. Please contact us to find out more!";
    
    /**
     * Creates a new instance of ClubInfo
     */
    public ClubInfoBean() {
    }

    /**
     * @return the DONATE
     */
    public String getDONATE() {
        return DONATE;
    }

    /**
     * @return the ABOUT
     */
    public String getABOUT() {
        return ABOUT;
    }

    /**
     * @param DONATE the DONATE to set
     */
    public void setDONATE(String DONATE) {
        this.DONATE = DONATE;
    }

    /**
     * @param ABOUT the ABOUT to set
     */
    public void setABOUT(String ABOUT) {
        this.ABOUT = ABOUT;
    }
    
    
}
