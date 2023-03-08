package Main;

public class User {
    Integer id;
    String name;
    Integer points;

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

    public User(Integer id, String name, Integer points) {
        this.id = id;
        this.name = name;
        this.points = points;



    }
}
