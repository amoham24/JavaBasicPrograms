/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Ahmed Mohamed
 */
public class FoodItem {

    ArrayList<String> foodData = new ArrayList<String>();
    ArrayList<Integer> expData = new ArrayList<Integer>();
    String foodName;
    int foodExpDate;

    /**
     * Constructor for FoodItem
     *
     * @param foodn
     * @param exp
     */
    public FoodItem(String foodn, int exp) {
        foodName = foodn;
        foodExpDate = exp;

    }

    /**
     * Getter for the Data of Food Stored
     *
     */
    public ArrayList<String> getFoodData() {
        return foodData;
    }

    /**
     * getter for the expiration date data
     *
     */
    public ArrayList<Integer> getExpData() {
        return expData;
    }

    /**
     * Removes Food from the AarrayList of food names
     *
     * @param index
     */
    public void removeFood(int index) {
        //removes thefood from the array
        foodData.remove(index);
    }

    /**
     * Removes expiration Date from the AarrayList of expiration dates
     *
     * @param index
     */
    public void removeExpDate(int index) {
        //remove the expiration date from the arrraylist
        expData.remove(index);
    }

    /**
     * Adds food to the food array data
     *
     * @param food
     */
    public void addFood(String food) {
        //adds food to array
        foodData.add(food);
    }

    /**
     * adds expiration date to the ArrayList of expiration dates data
     *
     * @param exp
     */
    public void addExpDate(int exp) {
        //adds expiration date
        expData.add(exp);
    }

    /**
     * getter for the food name
     *
     */
    public String getFood() {
        return foodName;
    }

    /**
     * Getter for the food expiration date
     *
     */
    public int getFoodExp() {
        return foodExpDate;
    }

}
