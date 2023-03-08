package Main;

public class Chore {
    Integer id;
    String name;
    Integer status;
    Boolean reoccuring;
    Integer assigned_to;
    Integer time;

    /**
     * @param id          The ID of the chore
     * @param name        The name/desc of the chore.
     * @param status      Current status, E.g Not Done, Doing, Done
     * @param reoccuring  Is this chore reoccuring? E.g weekly
     * @param assigned_to Who is completing this chore?
     * @param time        Overral time estimate of this chore.
     */
    public Chore(Integer id, String name, Integer status, Boolean reoccuring, Integer assigned_to, Integer time) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getReoccuring() {
        return reoccuring;
    }

    public void setReoccuring(Boolean reoccuring) {
        this.reoccuring = reoccuring;
    }

    public Integer getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(Integer assigned_to) {
        this.assigned_to = assigned_to;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}

