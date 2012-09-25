/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package foodtypes;

/**
 *
 * @author production
 */
public class PorkFood implements FoodType {

    private static final String ERROR = "error - not a valid text entry";
    private String name;
    private String description = "Generous slice of pork served with fresh vegetables, baked potato and soup or salad.";
    private String availability = "Dinner";
    private Double price = 12.85;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (description.length() == 0 || description == null) {
            this.name = ERROR;
        } else {
            this.name = name;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() == 0 || description == null) {
            this.description = ERROR;
        } else {
            this.description = description;
        }
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        if (description.length() == 0 || description == null) {
            this.availability = ERROR;
        } else {
            this.availability = availability;
        }
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price <= 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }
}
