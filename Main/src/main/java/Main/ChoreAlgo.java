/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author ScytheNight
 */
public class ChoreAlgo {

    private Integer id;
    private String name;
    private boolean selected;
    private String status; //need to look at
    private boolean reoccuring; //might need to look at.
    //private String assigned_to; //why string
    private int assignedTo;
    //private Integer time;
    private double user1Est; // it might be easier with Integer time I just couldn't get the algorithm work.
    private double user2Est;

    /**
     * @param id The ID of the chore.
     * @param name The name/desc of the chore.
     * @param selected Have the users actully selected to do this chore for this
     * week.
     * @param status Current status, E.g Not Done, Doing, Done.
     * @param reoccuring Is this chore reoccuring? E.g weekly.
     * @param assignedTo Who is completing this chore? 0 == not assigned, 1 ==
     * assigned to user 1, 2 == assigned to user 2,
     * @param time Overral time estimate of this chore.
     * @param user1Est user1 overral time estimate of this chore.
     * @param user2Est user2 0verral time estimate of this chore.
     *
     */
    /*
    public Chore(Integer id, String name, String status, Boolean reoccuring, Integer time, Sring assignedTo) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.reoccuring = reoccuring;
        this.assignedTo = assignedTo;
        this.time = time;
    }
     */
    public ChoreAlgo() {
        this.id = 0;
        this.name = "undefined";
        this.selected = false;
        this.status = "undefined";
        this.reoccuring = false;
        this.assignedTo = 0;
        this.user1Est = 0;
        this.user2Est = 0;
    }

    /*
    public ChoreAlgo(Integer id, String name, boolean selcted, String status, boolean reoccuring, double us1est, double us2est) {
        this.id = id;
        this.name = name;
        this.selected = selcted;
        this.status = status;
        this.reoccuring = reoccuring;
        this.assignedTo = 0;
        this.user1Est = us1est;
        this.user2Est = us2est;
    }*/
    
    // String status, boolean reoccuring
    public ChoreAlgo(Integer id, String name, boolean selcted, double us1est, double us2est) {
        this.id = id;
        this.name = name;
        this.selected = selcted;
        this.assignedTo = 0;
        this.user1Est = us1est;
        this.user2Est = us2est;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean Selected) {
        this.selected = Selected;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getReoccuring() {
        return reoccuring;
    }

    public void setReoccuring(Boolean reoccuring) {
        this.reoccuring = reoccuring;
    }

    /*
    public String getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }
     */
    public int getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(int assignedTo) {
        this.assignedTo = assignedTo;
    }

    /*
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
     */
    public double getUser1Est() {
        return user1Est;
    }

    public double getUser2Est() {
        return user2Est;
    }

    public void setUser1Est(double user1Est) {
        this.user1Est = user1Est;
    }

    public void setUser2Est(double user2Est) {
        this.user2Est = user2Est;
    }

}
