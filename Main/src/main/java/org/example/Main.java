package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        DatabaseConnection DBCon = new DatabaseConnection();
        DBCon.Connect(System.getProperty("user.dir") + "/database.db");
    }
}