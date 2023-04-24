package Main;

public class Chore {

    Integer id;
    String name;
    String status;
    Boolean reoccuring;
    String assigned_to;
    Integer time;

    /**
     * @param id The ID of the chore
     * @param name The name/desc of the chore.
     * @param status Current status, E.g Not Done, Doing, Done
     * @param reoccuring Is this chore reoccuring? E.g weekly
     * @param assigned_to Who is completing this chore?
     * @param time Overrall time estimate of this chore.
     */
    public Chore(Integer id, String name, String status, Boolean reoccuring, Integer time, String assigned_to) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.reoccuring = reoccuring;
        this.assigned_to = assigned_to;
        this.time = time;
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

    public String getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
