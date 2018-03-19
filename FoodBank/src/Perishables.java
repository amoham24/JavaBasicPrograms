/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Mohamed
 */
public class Perishables extends FoodItem {

    /**
     * Constructor for Perishables
     *
     * @param foodn
     * @param exp
     */
    public Perishables(String foodn, int exp) {
        super(foodn, exp);
    }

    /**
     * boolean method that checks if the date inputed is expired
     *
     * @param currentDate
     * @param foodDate
     */
    public boolean isExpired(int currentDate, int foodDate) {
        //MMDDYYYY format remember

        //gets the first two places for the month
        int foodMonth = (int) (foodDate / 1000000);
        //gets the middle two places for day
        int foodDay = (int) (foodDate / 10000);
        foodDay = (foodDay % 100);
        //gets the last two places for year
        int foodYear = (foodDate % 10000);

        //does the same this for currrent date
        int curMonth = (int) (currentDate / 1000000);
        int curDay = (int) (currentDate / 10000);
        curDay = (curDay % 100);
        int curYear = (currentDate % 10000);
        // ****************** YOU CAN PRINT OUT THE DATE SEPERATELY TO SEE IT IN ACTION ****************
//        System.out.println(foodMonth);
//        System.out.println(foodDay);
//        System.out.println(foodYear);
//        
//        System.out.println(curMonth);
//        System.out.println(curDay);
//        System.out.println(curYear);
        //checks by year, then month , then day
        if (curYear > foodYear) {
            return true;
        }
        if (curYear < foodYear) {
            return false;
        } else {
            if (curMonth > foodMonth) {
                return true;
            }
            if (curMonth < foodMonth) {
                return false;
            } else {
                if (curDay < foodDay) {
                    return false;
                } else {
                    return true;
                }

            }
        }
    }

    /**
     * Adds Expiration dates to the array list of expiration dates
     *
     * @param exp
     */
    public void addExp(int exp) {
        //adds the expiration date
        this.expData.add(exp);

    }

    /**
     * adds the food name to the ArrayList of food names
     *
     * @param foodNam
     */
    public void addFood(String foodNam) {
        //adds the food to the arrraylist
        this.foodData.add(foodNam);
    }
}
