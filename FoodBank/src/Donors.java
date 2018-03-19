/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Mohamed
 */
public class Donors extends UserAccount {

    /**
     * Constructor for Donors
     *
     * @param String userName
     * @param int userData
     */

    public Donors(String userName, int userDate) {
        super(userName, userDate);
    }

    /**
     * adds names to ArrayList of data
     *
     * @param String nam
     */
    public void addNamesData(String nam) {
        //adds the names to the data array
        this.namesData.add(nam);
    }

    /**
     * Adds dates to the ArrayList of Data
     *
     * @param int dat
     */
    public void addDatesData(int dat) {
        //add the dates to the data array for dates
        this.datesData.add(dat);
    }

}
