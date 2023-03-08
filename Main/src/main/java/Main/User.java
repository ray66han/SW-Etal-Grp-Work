package Main;

public class User {
    Integer id;
    String name;
    String email;
    Integer group;

    public User(Integer id, String name, String email, Integer group) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.group = group;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }
}
