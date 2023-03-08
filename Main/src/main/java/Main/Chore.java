package Main;

public class Chore {
    Integer chore_id;
    String chore_name;
    Integer chore_status;
    Boolean chore_reoccuring;
    Integer chore_assigned_to;
    Integer chore_weight;

    /**
     *
     * @param id The ID of the chore
     * @param name The name/desc of the chore.
     * @param status Current status, E.g Not Done, Doing, Done
     * @param reoccuring Is this chore reoccuring? E.g weekly
     * @param assigned_to Who is completing this chore?
     * @param weight Overral time estimate of this chore.
     */
    public Chore(Integer id, String name, Integer status, Boolean reoccuring, Integer assigned_to, Integer weight) {
        this.chore_id = id;
        this.chore_name = name;
        this.chore_status = status;
        this.chore_reoccuring = reoccuring;
        this.chore_assigned_to = assigned_to;
        this.chore_weight = weight;
    }

    public Integer getChore_id() {
        return chore_id;
    }

    public void setChore_id(Integer chore_id) {
        this.chore_id = chore_id;
    }

    public String getChore_name() {
        return chore_name;
    }

    public void setChore_name(String chore_name) {
        this.chore_name = chore_name;
    }

    public Integer getChore_status() {
        return chore_status;
    }

    public void setChore_status(Integer chore_status) {
        this.chore_status = chore_status;
    }

    public Boolean getChore_reoccuring() {
        return chore_reoccuring;
    }

    public void setChore_reoccuring(Boolean chore_reoccuring) {
        this.chore_reoccuring = chore_reoccuring;
    }

    public Integer getChore_assigned_to() {
        return chore_assigned_to;
    }

    public void setChore_assigned_to(Integer chore_assigned_to) {
        this.chore_assigned_to = chore_assigned_to;
    }

    public Integer getChore_weight() {
        return chore_weight;
    }

    public void setChore_weight(Integer chore_weight) {
        this.chore_weight = chore_weight;
    }
}

