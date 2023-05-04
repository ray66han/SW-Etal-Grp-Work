package Main;

import java.util.Date;

public class User {

    private Integer id;
    private String name;
    private Integer age;
    private Date dateOfBirth;
    private String sex;
    private Integer points;
    private Integer totalChores;
    private Integer completedChores;
    private double weight;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setSateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public User(Integer id, String name, Integer points, Integer totalChores, Integer completedChores) {
        this.id = id;
        this.name = name;
        this.age = 0;
        //this.dateOfBirth = ;
        this.sex = "";
        this.points = points;
        this.totalChores = totalChores;
        this.completedChores = completedChores;
        this.weight = 0.0;
    }
}
