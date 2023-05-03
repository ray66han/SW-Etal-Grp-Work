package Main;

public class ChoreAlgo {

    //Everything commented out is the original code.
    /*
    Integer id;
    String name;
    String status;
    Boolean reoccuring;
    String assigned_to;
    Integer time;
     */
    private Integer id;
    private String name;
    private boolean selected;
    private String status;
    private boolean reoccuring; // Is reoccuring the same as selected?
    //private String assigned_to;
    private int assigned_to;
    //private Integer time;
    private double user1Est;
    private double user2Est;

    /**
     * @param id The ID of the chore.
     * @param name The name/desc of the chore.
     * @param selected Have the users actually selected to do this chore for
     * this week.
     * @param status Current status, E.g Not Done, Doing, Done.
     * @param reoccuring Is this chore reoccurring? E.g weekly.
     * @param assigned_to Who is completing this chore? 0 == not assigned, 1 ==
     * assigned to user 1, 2 == assigned to user 2.
     * @param time Overall time estimate of this chore.
     * @param user1Est user1 Overall time estimate of this chore.
     * @param user2Est user2 Overall time estimate of this chore.
     */
    /*
    public Chore(Integer id, String name, String status, Boolean reoccuring, Integer time, String assigned_to) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.reoccuring = reoccuring;
        this.assigned_to = assigned_to;
        this.time = time;
    }
     */
    // Defult chore.
    public ChoreAlgo() {
        this.id = 0;
        this.name = "undefined";
        this.selected = false;
        this.status = "undefined";
        this.reoccuring = false;
        this.assigned_to = 0;
        this.user1Est = 0;
        this.user2Est = 0;
    }

    public ChoreAlgo(Integer id, String name, boolean selcted, String status, boolean reoccuring, double us1est, double us2est) {
        this.id = id;
        this.name = name;
        this.selected = selcted;
        this.status = status;
        this.reoccuring = reoccuring;
        this.assigned_to = 0;
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
    public int getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(int assigned_to) {
        this.assigned_to = assigned_to;
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

    public void setUser1Est(double user1Est) {
        this.user1Est = user1Est;
    }

    public double getUser2Est() {
        return user2Est;
    }

    public void setUser2Est(double user2Est) {
        this.user2Est = user2Est;
    }

}