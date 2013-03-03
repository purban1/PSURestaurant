package edu.wctc.distjava.blueproject.controller;

import java.io.Serializable;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Patrick Urban
 */
@Named(value="donation")
@RequestScoped
public class DonationBean implements Serializable {

    public String lastName;
    public String firstName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String amount;
    
    
    /**
     * Creates a new instance of DonationBean
     */
    public DonationBean() {
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
        System.out.println(state);
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
        System.out.println(zip);
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
        System.out.println(amount);
    }

    @Override
    public String toString() {
        return "DonationBean{" + "lastName=" + lastName + ", firstName=" + 
                firstName + ", address=" + address + ", city=" + city + 
                ", state=" + state + ", zip=" + zip + ", amount=" + amount + '}';
    }
    
    
}
