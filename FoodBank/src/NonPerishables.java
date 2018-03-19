/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Mohamed
 */
public class NonPerishables extends FoodItem {

    /**
     * Constructor for NonPerishables
     *
     * @param foodn
     * @param exp
     */
    public NonPerishables(String foodn, int exp) {
        super(foodn, exp);
    }

    /**
     * Adds a blank expiration date because the food is nonperishable
     *
     */
    public void addExp() {
        //adds expiration date which would be blank since it is a nonperishable
        this.expData.add(00000000);

    }

    /**
     * adds the food to the food data ArrayList
     *
     * @param foodNam
     */
    public void addFood(String foodNam) {
        //adds the food to the arraylist
        this.foodData.add(foodNam);
    }
}
