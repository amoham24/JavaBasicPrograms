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

public class UserAccount {

    ArrayList<String> namesData = new ArrayList<String>();
    ArrayList<Integer> datesData = new ArrayList<Integer>();
    String name;
    int date;

    /**
     * Constructor for UserAccount
     *
     * @param userName
     * @param userDate
     */
    public UserAccount(String userName, int userDate) {

        name = userName;
        date = userDate;
    }

    /**
     * getter for the ArrayList of of names
     *
     */
    public ArrayList<String> getNamesData() {
        return namesData;
    }

    /**
     * Getter for the ArrayList of dates
     *
     */
    public ArrayList<Integer> getDatesData() {
        return datesData;
    }

    /**
     * getter for user name
     *
     */
    public String getName() {
        return name;
    }

    /**
     * getter for user date
     *
     */
    public int getDate() {
        return date;
    }

    /**
     * Setter for name
     *
     * @param newName
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * setter for date
     *
     * @param newDate
     */
    public void setDate(int newDate) {
        date = newDate;
    }
}
