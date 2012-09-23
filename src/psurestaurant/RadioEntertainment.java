/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psurestaurant;

/**
 *
 * @author production
 */
public class RadioEntertainment implements EntertainmentType {

    private static final String ERROR = "error - not a valid text entry";
    private String Description = "Musical hits to enjoy while dining.";
    private String type = "Radio";

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
