/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psurestaurant;

import entertainment_type.RadioEntertainment;
import restaurant_types.FamilyDiningRestaurantType;

/**
 *
 * @author production
 */
public class FamilyFoodJoint extends Restaurant{
    private String restaurantType = new FamilyDiningRestaurantType().getType();
    private String entertainment = new RadioEntertainment().getDescription();

    public String getEntertainment() {
        return entertainment;
    }

    public String getRestaurantType() {
        return restaurantType;
    }
}
