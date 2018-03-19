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

public class FoodBank {

    //MAIN METHOD THAT RUNS PROGRAM
    public static void main(String[] args) throws InterruptedException {

        //input Scanner, will be repeated throuout program
        Scanner input = new Scanner(System.in);

        //log of all the donors names and dates
        ArrayList<UserAccount> allUsers = new ArrayList<>();

        //log of all the donors food namae and expiration dates
        ArrayList<FoodItem> allFoodItems = new ArrayList<>();

        //log of employees
        ArrayList<Employee> allEmployees = new ArrayList<>();

        //log of volunteers
        ArrayList<Volunteer> allVolunteers = new ArrayList<>();

        //loops the menu until broken
        while (true) {
            System.out.println("\t USER MENU");
            //user name
            System.out.println("Whats your full name?");
            input = new Scanner(System.in);
            String name = input.nextLine();

            //user date
            System.out.println("Whats the date? Please enter MMDDYYYY format!");
            input = new Scanner(System.in);
            int date = input.nextInt();

            //menu for who is in using the program
            System.out.println("Which of the following are you? (ENTER NUMBER)");
            System.out.println("1 - Employee");
            System.out.println("2 - Volunteer");
            System.out.println("3 - Donor");
            input = new Scanner(System.in);
            int user = input.nextInt();

            //switch statement that lets the user choose
            switch (user) {

                //when the user chooses Employee
                case 1:
                    user = 1;
                     {
                        Employee emp = new Employee(name, date);

                        //we assume the user is new
                        boolean isPastUser = false;
                        for (Employee i : allEmployees) {
                            if (i.getName().equals(name)) {
                                emp = i;
                                i.setNewDate(date);
                                //if the user name is found in the previos logs, that person is logged back in
                                isPastUser = true;
                                System.out.println("Welcome back, " + name);
                            }
                        }
                        //when the user is new, the user puts in their info
                        if (isPastUser == false) {
                            System.out.println("If it's not rude to ask, whats your salary?");
                            input = new Scanner(System.in);
                            int salary = input.nextInt();
                            emp.setSalary(salary);
                            System.out.println("Whats your position as an Employee?");
                            input = new Scanner(System.in);
                            String position = input.nextLine();
                            emp.setPosition(position);

                            //adds employee to database
                            allEmployees.add(emp);
                        }

                        //////////////////////////////////// menu to give food ///////////////////////
                        if (allUsers.isEmpty() && allFoodItems.isEmpty()) {
                            System.out.println("There is nothing in the food bank yet for you to give out!");
                        } else {
                            System.out.println("What are you giving out? ENTER NUMBER");
                            System.out.println("");
                            int index = 0;
                            for (UserAccount i : allUsers) {
                                System.out.print(index + " - " + i.getName() + " at date " + i.getDate());

                                System.out.println(" donated " + allFoodItems.get(index).getFood() + " which expires " + allFoodItems.get(index).getFoodExp());
                                index++;
                            }
                            input = new Scanner(System.in);
                            //taken in the user's choice
                            int foodGive = input.nextInt();

                            Perishables isExpCheck = new Perishables(name, date);
                            if (!isExpCheck.isExpired(date, allFoodItems.get(foodGive).getFoodExp()) || allFoodItems.get(foodGive).getFoodExp() == 0) {
                                System.out.println("Your food is NOT expired,  so you are in the clear for giving it out!");
                                System.out.println("\n What is the name of the person or organization you will be giving to?");
                                input = new Scanner(System.in);
                                String nameOrg = input.nextLine();
                                //takes in user orgainzation of choice and prints a message for them
                                System.out.println("You earned your salary of $" + emp.getSalary() + "Thank you for your hard work! \n" + nameOrg + " will be happy to have the new " + allFoodItems.get(foodGive).getFood());
                                System.out.println("\n We are now removing the log from out database...");

                                //adds the pay when they sucessfully did their work then pauses
                                emp.addPay();
                                Thread.sleep(700);
                            } else {

                                //prints this message when food is expired food is trying to be accessed then it is removed 
                                System.out.println("Sorry the food you are trying to give out is now expired, DON'T GIVE IT! \n Don't worry, we'll remove it now.");
                                allUsers.remove(foodGive);
                                allFoodItems.remove(foodGive);
                                Thread.sleep(500);
                            }
                        }

                        break;
                    }
                //when the user chooses volunteering
                case 2:
                    user = 2;
                    Volunteer vol = new Volunteer(name, date);
                    //does same thing as an employee as far as being able to log back in
                    boolean isPastUser = false;
                    for (Volunteer i : allVolunteers) {
                        if (i.getName().equals(name)) {
                            vol = i;
                            i.setNewDate(date);
                            isPastUser = true;
                            System.out.println("Welcome back, " + name);
                        }
                    }

                    if (isPastUser == false) {
                        System.out.println("What school are you volunteering from?");
                        input = new Scanner(System.in);
                        String schoolFrom = input.nextLine();
                        vol.setSchoolFrom(schoolFrom);
                        System.out.println("How many credits are you receiving for this work?");
                        input = new Scanner(System.in);
                        int credits = input.nextInt();
                        vol.setCreditsGiven(credits);
                        allVolunteers.add(vol);
                    }
                    ////////////////////////////// menu to give food /////////////////////
                    //same comments from Employee
                    if (allUsers.isEmpty() && allFoodItems.isEmpty()) {
                        System.out.println("There is nothing in the food bank yet for you to give out!");
                    } else {
                        System.out.println("What are you giving out? ENTER NUMBER");
                        System.out.println("");
                        int index = 0;
                        for (UserAccount i : allUsers) {
                            System.out.print(index + " - " + i.getName() + " at date " + i.getDate());

                            System.out.println(" donated " + allFoodItems.get(index).getFood() + " which expires " + allFoodItems.get(index).getFoodExp());
                            index++;
                        }
                        input = new Scanner(System.in);
                        int foodGive = input.nextInt();

                        Perishables isExpCheck = new Perishables(name, date);
                        if (!isExpCheck.isExpired(date, allFoodItems.get(foodGive).getFoodExp()) || allFoodItems.get(foodGive).getFoodExp() == 0) {
                            System.out.println("Your food is NOT expired,  so you are in the clear for giving it out!");
                            System.out.println("\n What is the name of the person or organization you will be giving to?");
                            input = new Scanner(System.in);
                            String nameOrg = input.nextLine();
                            System.out.println("Thank you for your hard work! \n" + nameOrg + " will be happy to have thei new " + allFoodItems.get(foodGive).getFood());
                            System.out.println("\n We are now removing the log from out database...");
                            vol.addTimesDone();
                            if (vol.completed()) {
                                System.out.println("You have given out enough to earn your credits!");
                            }

                            Thread.sleep(1000);
                        } else {

                            System.out.println("Sorry the food you are trying to give out is now expired, DON'T GIVE IT! \n Don't worry, we'll remove it now.");
                            allUsers.remove(foodGive);
                            allFoodItems.remove(foodGive);
                            Thread.sleep(500);

                        }
                    }
                    break;
                //if the user chooses Donor
                case 3:
                    user = 3;
                    Donors don = new Donors(name, date);
                    //asks the user what to input then stores it
                    System.out.println("What would you like to donate?");
                    input = new Scanner(System.in);
                    String food = input.nextLine();
                    don.addNamesData(name);
                    don.addDatesData(date);

                    //asks the user if it is nonPerishable or perishable
                    System.out.println("Is it a NonPerishable food?");
                    input = new Scanner(System.in);
                    char nonPerishChoice = input.next().charAt(0);
                    if (nonPerishChoice == 'y' || nonPerishChoice == 'Y') {
                        //if it is non perishable it will be added automaticly with a blank expiration date
                        NonPerishables nonPerish = new NonPerishables(food, 00000000);
                        nonPerish.addFood(food);
                        System.out.println("Thank you for Donating!");

                        allUsers.add(don);
                        allFoodItems.add(nonPerish);

                        Thread.sleep(900);

                    } else {
                        //if it is Perishable then they will input thhe exp
                        System.out.println("When is the experation date? PLEASE ENTER MMDDYYYY");
                        input = new Scanner(System.in);
                        int expDate = input.nextInt();
                        //checks to see if the food is expired
                        Perishables perish = new Perishables(food, expDate);
                        if (perish.isExpired(date, expDate) == true) {
                            //if it is expired the food wont be put in and it will exit the Donor function
                            System.out.println("Your food is EXPIRED can't be put in!");
                            break;
                        } else {
                            //if it is not expired it will be added to the bank
                            System.out.println("Your food is not expired, putting it in the bank now!");
                            allUsers.add(don);
                            allFoodItems.add(perish);
                            Thread.sleep(900);
                        }

                    }

                    break;

            }
            //after the switch stament the user has the option to see the logs
            System.out.println("Would you like to see the logs?");
            input = new Scanner(System.in);
            char seeLog = input.next().charAt(0);
            if (seeLog == 'y' || seeLog == 'Y') {
                //lets the user choose what log to see
                System.out.println("Which log would you like to see?");
                System.out.println("1 - Food Bank Log");
                System.out.println("2 - Employee Log");
                System.out.println("3 - Volunteer Log");
                input = new Scanner(System.in);
                int log = input.nextInt();

                switch (log) {
                    //goes through each choise printing each log. basic code
                    case 1:
                        log = 1;
                        if (allUsers.isEmpty() && allFoodItems.isEmpty()) {
                            System.out.println("There is nothing in the food bank yet!");
                            Thread.sleep(400);
                        } else {
                            System.out.println("Donator Name" + "\t\t" + "Date Given" + "\t\t" + "Food Name" + "\t\t" + "Expiration Date");
                            System.out.println("");
                            int index = 0;
                            for (UserAccount i : allUsers) {
                                System.out.print(i.getName() + "\t\t" + i.getDate() + "\t\t");

                                System.out.print(allFoodItems.get(index).getFood() + "\t\t");
                                if (allFoodItems.get(index).getFoodExp() == 0) {
                                    System.out.println("NonPerishable");
                                } else {
                                    System.out.println(allFoodItems.get(index).getFoodExp());
                                }

                                index++;
                            }

                        }
                        break;

                    case 2:
                        log = 2;
                        if (allEmployees.isEmpty()) {
                            System.out.println("There are no Employees the have logged in.");
                            Thread.sleep(400);
                        } else {
                            System.out.println("Employee's Name" + "\t\t" + "Position" + "\t\t" + "Salary" + "\t\t" + "Total Pay");
                            System.out.println("");

                            for (Employee i : allEmployees) {
                                System.out.print(i.getName() + "\t\t" + i.getPosition() + "\t\t$" + i.getSalary() + "\t\t" + i.getTotalPay());
                                System.out.println("");

                            }
                        }
                        break;

                    case 3:
                        log = 3;
                        if (allVolunteers.isEmpty()) {
                            System.out.println("There are no Volunteers the have logged in.");
                            Thread.sleep(400);
                        } else {
                            System.out.println("Volunteer's Name" + "\t\t" + "School From" + "\t\t" + "Credits to be Earned" + "\t\t" + "Amount needed to receive credit");
                            System.out.println("");

                            for (Volunteer i : allVolunteers) {
                                System.out.print(i.getName() + "\t\t" + i.getSchoolFrom() + "\t\t" + i.getCreditsGiven() + "\t\t");
                                if (i.completed()) {
                                    System.out.print("COMPLETED");
                                    System.out.println("");
                                }
                                System.out.print(i.getTimesDone() + "/3");
                                System.out.println("");
                            }

                        }

                        break;

                }
                //asks the user if they would want to stop or continue the loop
                System.out.println("\n\n Would you like to STOP?");
                input = new Scanner(System.in);
                char cont = input.next().charAt(0);
                if (cont == 'y' || cont == 'Y') {
                    System.out.println("Thank You! GoodBye!");
                    break;
                }
            }

        }
    }
}
