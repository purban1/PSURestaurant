
package psurestaurant;

import foodtypes.DoubleCheeseburgerFood;
import foodtypes.PorkFood;
import foodtypes.ChickenBreastSandwichFood;
import foodtypes.CheeseburgerFood;
import foodtypes.BreakfastSandwichFood;

/**
 *
 * @author Patrick Urban
 * Application purpose is to demonstrate understanding of reusability of objects
 */
public class PSURestaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Restaurant food1 = new FastFoodJoint("Harry's Greasy Spoon", "10:00 AM", "9:00 PM", 
                new BreakfastSandwichFood(), 
                new CheeseburgerFood(), 
                new ChickenBreastSandwichFood());
        
        System.out.println("Welcome to " + food1.getName() + ". We are open from " + food1.getOpenTime() + " to " + 
                food1.getCloseTime() + " everyday of the week. We serve " + food1.getRestaurantType() + ".");
        System.out.println("Our menu choices to day include:");
        System.out.println("Breakfast: " + food1.getBreakfastItem().getDescription());
        System.out.println("Lunch: " + food1.getLunchItem().getDescription());
        System.out.println("Dinner: " + food1.getDinnerItem().getDescription());
        System.out.println(food1.getEntertainment() + "\n");
        
        // Swamp out lunch and dinner object
        food1.setLunchItem(new DoubleCheeseburgerFood());
        food1.setDinnerItem(new PorkFood());
        
        System.out.println("We've changed our lunch and dinner items. Now the choises are:");
        System.out.println("Breakfast: " + food1.getBreakfastItem().getDescription());
        System.out.println("Lunch: " + food1.getLunchItem().getDescription());
        System.out.println("Dinner: " + food1.getDinnerItem().getDescription() + "\n");
    }
}
