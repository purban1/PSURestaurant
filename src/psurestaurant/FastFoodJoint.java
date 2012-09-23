/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psurestaurant;

/**
 *
 * @author production
 */
public class FastFoodJoint extends Restaurant{
    private String restaurantType = new FastFoodRestaurantType().getType();
    private String entertainment = new NoEntertainment().getDescription();

    /**
     * 
     * @param opening sets the opening hours
     * @param closing sets the closing hours
     * @param breakfast sets what is the main breakfast food
     * @param lunch sets what is the main meal for lunch
     * @param dinner  sets what is the main meal for dinner
     */    
    public FastFoodJoint(String name, String opening, String closing, FoodType breakfast, FoodType lunch, FoodType dinner){
        super.setName(name);
        super.setBreakfastItem(breakfast);
        super.setLunchItem(lunch);
        super.setDinnerItem(dinner);
        super.setOpenTime(opening);
        super.setCloseTime(closing);
    }
    
    
    public String getEntertainment() {
        return entertainment;
    }

    public String getRestaurantType() {
        return restaurantType;
    }
}
