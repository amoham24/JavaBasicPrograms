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

public class Employee extends UserAccount {

    int salary;
    String position;

    int totalPay = 0;

    /**
     * Employee constructor
     *
     * @param String userName
     * @param int userDate
     */
    public Employee(String userName, int userDate) {
        super(userName, userDate);
    }

    /**
     * removes the name from the data Array
     *
     * @param int nameIndex
     */
    public void removeName(int nameIndex) {
        //removes the name from the arraylist
        this.namesData.remove(nameIndex);
    }

    /**
     * Removes Date from the AarrayList of dates
     *
     * @param dateIndex
     */
    public void removeDate(int dateIndex) {
        //removes date
        this.datesData.remove(dateIndex);
    }

    /**
     * Getter for salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Setter for Salary
     *
     * @param sal
     */
    public void setSalary(int sal) {
        salary = sal;
    }

    /**
     * Getter for position
     *
     */
    public String getPosition() {
        return position;
    }

    /**
     * Setter for position
     *
     * @param pos
     */
    public void setPosition(String pos) {
        position = pos;
    }

    /**
     * Setter for the newDate for past users
     *
     * @param newDate
     */
    public void setNewDate(int newDate) {
        //sets a new date
        this.date = newDate;

    }

    /**
     * adds their salary for when they've done their job
     *
     */
    public void addPay() {
        //adds their sallary to their total pay
        totalPay += salary;
    }

    /**
     * Getter for the total pay
     */
    public int getTotalPay() {
        return totalPay;
    }
}
