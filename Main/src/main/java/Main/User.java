package Main;

public class User {
    Integer id;
    String name;
    Integer points;
    Integer totalChores;
    Integer completedChores;

    public Integer getTotalChores() {
        return totalChores;
    }

    public void setTotalChores(Integer totalChores) {
        this.totalChores = totalChores;
    }

    public Integer getCompletedChores() {
        return completedChores;
    }

    public void setCompletedChores(Integer completedChores) {
        this.completedChores = completedChores;
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

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public User(Integer id, String name, Integer points, Integer totalChores, Integer completedChores) {
        this.id = id;
        this.name = name;
        this.points = points;
        this.totalChores = totalChores;
        this.completedChores = completedChores;
    }
}
