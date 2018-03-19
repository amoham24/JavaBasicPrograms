/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Mohamed
 */
import java.util.*;

public class Volunteer extends UserAccount {

    String schoolFrom;
    int creditsGiven;
    int timesDone = 0;

    /**
     * Constructor for Volunteers
     *
     * @param userName
     * @param userdate
     */
    public Volunteer(String userName, int userDate) {
        super(userName, userDate);
    }

    /**
     * Removes names from the AarrayList of dates
     *
     * @param nameIndex
     */
    public void removeName(int nameIndex) {
        //removes the name from the arraylist
        this.namesData.remove(nameIndex);
    }

    /**
     * Removes Date from the AarrayList of dates
     *
     * @param dataeIndex
     */
    public void removeDate(int dateIndex) {
        //removes date from the arraylist
        this.datesData.remove(dateIndex);
    }

    /**
     * Getter from what school the volunteer if from
     *
     */
    public String getSchoolFrom() {
        return schoolFrom;
    }

    /**
     * Setter for what school the volunteer is from
     *
     * @param schoolF
     */
    public void setSchoolFrom(String schoolF) {
        schoolFrom = schoolF;
    }

    /**
     * Getter for the credits that will be given when they sent out enough food
     *
     */
    public int getCreditsGiven() {
        return creditsGiven;
    }

    /**
     * Setter for the credits given
     *
     * @param creditsg
     */
    public void setCreditsGiven(int creditsg) {
        creditsGiven = creditsg;
    }

    /**
     * Setter for the new date for past users
     *
     * @param newDate
     */
    public void setNewDate(int newDate) {
        //puts in a new date for new users
        this.date = newDate;

    }

    /**
     * counter to the amount of times the volunteer gave out food
     *
     */
    public void addTimesDone() {
        //counts for the ammount of times the volunteer gave out food
        timesDone++;

    }

    /**
     * getter for the times the volunteer gave out food
     *
     */
    public int getTimesDone() {
        return timesDone;
    }

    /**
     * boolean method that checks if the volunteer completed the requirement of
     * three times done.
     *
     */
    public boolean completed() {
        //checks if the volunteer gave out food  atleast 3 times, therefore that person has completed the requirement for the credits
        if (timesDone >= 3) {
            return true;
        } else {
            return false;
        }

    }

}
