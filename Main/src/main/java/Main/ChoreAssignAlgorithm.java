package Main;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ScytheNight
 */
public class ChoreAssignAlgorithm {

    //Is fetched from the DB.
    ArrayList<ChoreAlgo> chores = new ArrayList<ChoreAlgo>();

    //Create dummy data. Can delete later.
    public void createDummyData() {
        ChoreAlgo c = new ChoreAlgo(1, "Wash Dishes", true, 20, 15);
        chores.add(c);
        c = new ChoreAlgo(2, "Wash Dog", true, 21, 30);
        chores.add(c);
        c = new ChoreAlgo(3, "Wash Cat", true, 12, 24);
        chores.add(c);
        c = new ChoreAlgo(4, "Wash Kid", true, 17, 10);
        chores.add(c);
        c = new ChoreAlgo(5, "Walk Dog", true, 21, 30);
        chores.add(c);
        c = new ChoreAlgo(6, "Walk Cat", true, 12, 24);
        chores.add(c);
        c = new ChoreAlgo(7, "Walk Kid", true, 17, 10);
        chores.add(c);
        c = new ChoreAlgo(8, "Make Bed", true, 21, 30);
        chores.add(c);
        c = new ChoreAlgo(9, "Take Bins Out", true, 12, 24);
        chores.add(c);
        c = new ChoreAlgo(10, "Clean Oven", true, 17, 10);
        chores.add(c);
        c = new ChoreAlgo(11, "Wash Floor", true, 21, 30);
        chores.add(c);
        c = new ChoreAlgo(12, "Polish Floor", true, 12, 24);
        chores.add(c);
        c = new ChoreAlgo(13, "Wash Windows", true, 17, 10);
        chores.add(c);
        c = new ChoreAlgo(14, "Wash Kid", true, 17, 10);
        chores.add(c);
        c = new ChoreAlgo(15, "Walk Dog", true, 21, 30);
        chores.add(c);
        c = new ChoreAlgo(16, "Walk Cat", true, 12, 24);
        chores.add(c);
        c = new ChoreAlgo(17, "Walk Kid", true, 17, 10);
        chores.add(c);
        c = new ChoreAlgo(18, "Make Bed", true, 21, 30);
        chores.add(c);
        c = new ChoreAlgo(19, "Take Bins Out", true, 12, 24);
        chores.add(c);
        c = new ChoreAlgo(20, "Clean Oven", true, 17, 10);
        chores.add(c);
        c = new ChoreAlgo(21, "Wash Floor", true, 21, 30);
        chores.add(c);
        c = new ChoreAlgo(22, "Polish Floor", true, 12, 24);
        chores.add(c);
        c = new ChoreAlgo(23, "Wash Windows", true, 17, 10);
        chores.add(c);
        c = new ChoreAlgo(24, "Wash Kid", true, 17, 10);
        chores.add(c);
        c = new ChoreAlgo(25, "Walk Dog", true, 21, 30);
        chores.add(c);
        c = new ChoreAlgo(26, "Walk Cat", true, 12, 24);
        chores.add(c);
        c = new ChoreAlgo(27, "Walk Kid", true, 17, 10);
        chores.add(c);
        c = new ChoreAlgo(28, "Make Bed", true, 21, 30);
        chores.add(c);
        c = new ChoreAlgo(29, "Take Bins Out", true, 12, 24);
        chores.add(c);
        c = new ChoreAlgo(30, "Clean Oven", true, 17, 10);
        chores.add(c);
        c = new ChoreAlgo(31, "Wash Floor", true, 21, 30);
        chores.add(c);
        c = new ChoreAlgo(32, "Polish Floor", true, 12, 24);
        chores.add(c);
    }

    //Function for seeing if a chore is assigned or not.
    private boolean unassigenedChores() {
        for (ChoreAlgo c : chores) {
            if (c.getAssignedTo() == 0) {
                return true;
            }
        }
        return false;
    }

    //The actual chore assigning algorithm.
    public void choreAlgorithm() {

        //Is fetched from the DB.
        double user1WeightCarriedOver = 0.03;
        double user2WeightCarriedOver = 0;

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
            if (user1Weight < user2Weight) {//need to assign to user1.
                Collections.sort(chores, new Comparator<ChoreAlgo>() {
                    @Override
                    public int compare(ChoreAlgo c1, ChoreAlgo c2) {
                        return Double.compare(c2.getUser1Est(), c1.getUser1Est());
                    }
                });

                ChoreAlgo chosenChore = null;

                for (ChoreAlgo c : chores) {//trying to find suitable chore for user1
                    if (c.getAssignedTo() == 0 && c.getUser1Est() < c.getUser2Est()) {
                        chosenChore = c;
                        break;
                    }
                }
                if (chosenChore == null) {//find any chore for user1
                    for (ChoreAlgo c : chores) {
                        if (c.getAssignedTo() == 0) {
                            chosenChore = c;
                            break;
                        }
                    }
                }
                chosenChore.setAssignedTo(1); //assigning part
                user1Weight += chosenChore.getUser1Est();
            }//End of if.
            else { //need to assign to user2.
                Collections.sort(chores, new Comparator<ChoreAlgo>() {
                    @Override
                    public int compare(ChoreAlgo c1, ChoreAlgo c2) {
                        return Double.compare(c2.getUser2Est(), c1.getUser2Est());
                    }
                });

                ChoreAlgo chosenChore = null;

                for (ChoreAlgo c : chores) {//find suitable chore for user 2
                    if (c.getAssignedTo() == 0 && c.getUser2Est() < c.getUser1Est()) {
                        chosenChore = c;
                        break;
                    }
                }
                if (chosenChore == null) {//find any chore for user 2
                    for (ChoreAlgo c : chores) {
                        if (c.getAssignedTo() == 0) {
                            chosenChore = c;
                            break;
                        }
                    }
                }
                chosenChore.setAssignedTo(2); //assign here
                user2Weight += chosenChore.getUser2Est();
            }//End of else.
        }//End while unassigenedChores

        if (user1Weight > user2Weight) {
            user2WeightCarriedOver = user2Weight - user1Weight;
            user1WeightCarriedOver = 0;
        } else {
            user1WeightCarriedOver = user1Weight - user2Weight;
            user2WeightCarriedOver = 0;
        }

    }//End of choreAlgorithm.

    public static void main(String[] args) {
        ChoreAssignAlgorithm a = new ChoreAssignAlgorithm();

        a.createDummyData();
        a.choreAlgorithm();
    }
}//End of class Algorithm.
