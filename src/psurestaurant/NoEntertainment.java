/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psurestaurant;

/**
 *
 * @author production
 */
public class NoEntertainment implements EntertainmentType {

    private static final String ERROR = "error - not a valid text entry";
    private String Description = "No music is played while you are dining.";
    private String type = "None";

    public String getType() {
        return type;
    }

//    public void setType(String type) {
//        if (type.length() == 0 || type == null) {
//            this.type = ERROR;
//        } else {
//            this.type = type;
//        }
//    }
//
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        if (Description.length() == 0 || Description == null) {
            this.Description = ERROR;
        } else {
            this.Description = Description;
        }
    }
}
