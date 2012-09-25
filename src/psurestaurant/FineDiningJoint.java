/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psurestaurant;

import restaurant_types.FineDiningRestaurantType;
import entertainment_type.PianoEntertainment;

/**
 *
 * @author production
 */
public class FineDiningJoint extends Restaurant{
    private String restaurantType = new FineDiningRestaurantType().getType();
    private String entertainment = new PianoEntertainment().getDescription();

    public String getEntertainment() {
        return entertainment;
    }

    public String getRestaurantType() {
        return restaurantType;
    }
}
