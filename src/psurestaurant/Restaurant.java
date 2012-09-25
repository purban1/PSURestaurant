/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psurestaurant;

import foodtypes.FoodType;

/**
 *
 * @author production
 */
public abstract class Restaurant {
    private FoodType breakfastItem;
    private FoodType lunchItem;
    private FoodType dinnerItem;
    private String name;
    private String openTime;
    private String closeTime;
    private boolean carryOut = false;
    private boolean delivery = false;

    
    public abstract String getEntertainment();
    public abstract String getRestaurantType();
    
    /**
     * @return the breakfastItem
     */
    public final FoodType getBreakfastItem() {
        return breakfastItem;
    }

    /**
     * @param breakfastItem the breakfastItem to set
     */
    public final void setBreakfastItem(FoodType breakfastItem) {
        this.breakfastItem = breakfastItem;
    }

    /**
     * @return the lunchItem
     */
    public final FoodType getLunchItem() {
        return lunchItem;
    }

    /**
     * @param lunchItem the lunchItem to set
     */
    public final void setLunchItem(FoodType lunchItem) {
        this.lunchItem = lunchItem;
    }

    /**
     * @return the dinnerItem
     */
    public final FoodType getDinnerItem() {
        return dinnerItem;
    }

    /**
     * @param dinnerItem the dinnerItem to set
     */
    public final void setDinnerItem(FoodType dinnerItem) {
        this.dinnerItem = dinnerItem;
    }

    /**
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * @return the openTime
     */
    public final String getOpenTime() {
        return openTime;
    }

    /**
     * @param openTime the openTime to set
     */
    public final void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    /**
     * @return the closeTime
     */
    public final String getCloseTime() {
        return closeTime;
    }

    /**
     * @param closeTime the closeTime to set
     */
    public final void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * @return the carryOut
     */
    public final boolean isCarryOut() {
        return carryOut;
    }

    /**
     * @param carryOut the carryOut to set
     */
    public final void setCarryOut(boolean carryOut) {
        this.carryOut = carryOut;
    }

    /**
     * @return the delivery
     */
    public final boolean isDelivery() {
        return delivery;
    }

    /**
     * @param delivery the delivery to set
     */
    public final void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
    
     
    
}
