package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Aiden
 */
public class ChoreAssignAlgorithm {

    /*
    private ArrayList<ChoreAlgo> chores;
    //DatabaseFunctions database;
    //= Database.GET_FULL_CHORE_LIST();

    public ChoreAssignAlgorithm() {
        database = new DatabaseFunctions();
        chores = new ArrayList();
        try {
            chores = database.GET_FULL_CHORE_LIST();
        } catch (Exception e) {
            System.out.println("Error occured in extracting data");
        }
    }*/

 /*
    public ChoreAssignAlgorithm() {
        DatabaseFunctions Database = new DatabaseFunctions();
        ArrayList<Chore> chores = Database.GET_FULL_CHORE_LIST();
    }*/
    // Was meant to be fetching from the Database. Instead I am creating an ArrayList that uses the ChoreAlgo class constructor.
    ArrayList<ChoreAlgo> chores = new ArrayList<ChoreAlgo>();

    // I am creating dummy data that will be added to 'ArrayList<ChoreAlgo> chores'.
    public void createDummyData() {
        ChoreAlgo c = new ChoreAlgo(1, "Mop The Floors", true, "0", false, 13, 10);
        chores.add(c);
        c = new ChoreAlgo(2, "Hover The Floors", true, "0", false, 7, 9);
        chores.add(c);
        c = new ChoreAlgo(3, "Take Out Bins", true, "0", false, 2, 5);
        chores.add(c);
        c = new ChoreAlgo(4, "Wash & Hang Laundry", true, "0", false, 15, 10);
        chores.add(c);
        c = new ChoreAlgo(5, "Wash Dishes", true, "0", false, 6, 3);
        chores.add(c);
        c = new ChoreAlgo(6, "Wipe Counters", true, "0", false, 9, 12);
        chores.add(c);
        c = new ChoreAlgo(7, "Dust Surfaces", true, "0", false, 10, 10);
        chores.add(c);
        c = new ChoreAlgo(8, "Wash & Polish Windows", true, "0", false, 5, 8);
        chores.add(c);
        c = new ChoreAlgo(9, "Wash & Polish Mirrors", true, "0", false, 8, 4);
        chores.add(c);
        c = new ChoreAlgo(10, "Clean Bath, Shower, Sink, & Toilet", true, "0", false, 20, 15);
        chores.add(c);
        c = new ChoreAlgo(11, "Clear Out Fridge, Frezzer, & Pantry", true, "0", false, 11, 17);
        chores.add(c);
        c = new ChoreAlgo(12, "Clean Kitchen Appliances", true, "0", false, 17, 19);
        chores.add(c);
        c = new ChoreAlgo(13, "Cut, Sweep, & Water The Garden & Porch", true, "0", false, 23, 25);
        chores.add(c);
        c = new ChoreAlgo(14, "Unclog Drains", true, "0", false, 7, 5);
        chores.add(c);
        c = new ChoreAlgo(15, "Clear Gutters", true, "0", false, 14, 11);
        chores.add(c);
    }

    // Function for seeing if a chore is assigned to a user or not.
    private boolean unassigenedChores() {
        for (ChoreAlgo c : chores) {
            if (c.getAssigned_to() == 0) {
                return true;
            }
        }
        return false;
    }

    // The actual chore assigning algorithm.
    public void choreAlgorithm() {

        /*
        Was meant to be fetching from the Database.
        Instead I am assigning manually the weight
        carried over from the previous week if a user
        had done more work than the other user.
         */
        //double user1WeightCarriedOver = Database.SET_USER_WEIGHT();
        //double user2WeightCarriedOver = Database.SET_USER_WEIGHT();
        double user1WeightCarriedOver = 0.04;
        double user2WeightCarriedOver = 0.0;

        double user1Weight = user1WeightCarriedOver;
        double user2Weight = user2WeightCarriedOver;

        double totalEstimateUser1 = 0;
        double totalEstimateUser2 = 0;

        for (ChoreAlgo c : chores) {
            totalEstimateUser1 += c.getUser1Est();
            totalEstimateUser2 += c.getUser2Est();
        }

        for (ChoreAlgo c : chores) {
            c.setUser1Est(c.getUser1Est() / totalEstimateUser1);
            c.setUser2Est(c.getUser2Est() / totalEstimateUser2);
        }

        while (unassigenedChores()) {
            // Need to assign to User1.
            if (user1Weight < user2Weight) {
                Collections.sort(chores, new Comparator<ChoreAlgo>() {
                    @Override
                    public int compare(ChoreAlgo c1, ChoreAlgo c2) {
                        return Double.compare(c2.getUser1Est(), c1.getUser1Est());
                    }
                });

                ChoreAlgo chosenChore = null;

                // Find a suitable chore for User1.
                for (ChoreAlgo c : chores) {
                    if (c.getAssigned_to() == 0 && c.getUser1Est() < c.getUser2Est()) {
                        chosenChore = c;
                        break;
                    }
                }
                // Find any chore for User1.
                if (chosenChore == null) {
                    for (ChoreAlgo c : chores) {
                        if (c.getAssigned_to() == 0) {
                            chosenChore = c;
                            break;
                        }
                    }
                }
                // Assigning here.
                chosenChore.setAssigned_to(1);
                user1Weight += chosenChore.getUser1Est();
            }//End of if.
            // Need to assign to User2.
            else {
                Collections.sort(chores, new Comparator<ChoreAlgo>() {
                    @Override
                    public int compare(ChoreAlgo c1, ChoreAlgo c2) {
                        return Double.compare(c2.getUser2Est(), c1.getUser2Est());
                    }
                });

                ChoreAlgo chosenChore = null;

                // Find a suitable chore for User2.
                for (ChoreAlgo c : chores) {
                    if (c.getAssigned_to() == 0 && c.getUser2Est() < c.getUser1Est()) {
                        chosenChore = c;
                        break;
                    }
                }

                // Find any chore for User2.
                if (chosenChore == null) {
                    for (ChoreAlgo c : chores) {
                        if (c.getAssigned_to() == 0) {
                            chosenChore = c;
                            break;
                        }
                    }
                }
                // Assigning here.
                chosenChore.setAssigned_to(2);
                user2Weight += chosenChore.getUser2Est();
            }//End of else.
        }//End while unassigenedChores

        // Update the weight carried over if a user has done more work than the other user.
        if (user1Weight > user2Weight) {
            user2WeightCarriedOver = user2Weight - user1Weight;
            user1WeightCarriedOver = 0;
        } else {
            user1WeightCarriedOver = user1Weight - user2Weight;
            user2WeightCarriedOver = 0;
        }
        int x = 3;
        //SendAssignedChores();
    }//End of choreAlgorithm.

    /*
    // Send the updated ArrayList that is assigning a chore with a User.
    public void SendAssignedChores() {
        try {
            for (ChoreAlgo chore : chores) {
                User assigned = database.GET_USER_WITH_ID(Integer.valueOf(ChoreAlgo.getAssigned_to()));
                database.ASSIGN_CHORE_TO_USER(chore, assigned);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }*/
    public static void main(String[] args) {
        // Creates an object called algo.
        ChoreAssignAlgorithm algo = new ChoreAssignAlgorithm();

        // The algo object is calling the createDummyData() funcitons to create the dummy data.
        algo.createDummyData();
        // The algo object is calling the choreAlgorithm() funcitons to run the algorithm & assign the chores.
        algo.choreAlgorithm();
    }
}//End of ChoreAssignAlgorithm class.
