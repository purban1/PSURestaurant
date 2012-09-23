package psurestaurant;

/**
 *
 * @author Patrick Urban
 * 
 * FoodType Interface mandates that the food classes have fields for the name of the
 * food, price of the food, when the item is available (breakfast, lunch dinner or
 * a combination of the three) and a description (optional) 
 */
public interface FoodType {
    public abstract String getName();
    public abstract String getDescription();
    public abstract Double getPrice();
    public abstract String getAvailability();
    public abstract void setAvailability(String availability);
    public abstract void setPrice(Double price);
    public abstract void setName(String name);
    public abstract void setDescription(String desc);
}
