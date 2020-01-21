package com.example.postmethodwithmultiplejsonobjects;

public class DataObjectClass {

    private String id;
    private String email;
    private String gender;
    private String name;
    private LastLoginObject last_login;

    public DataObjectClass() {
    }

    public DataObjectClass(String id, String email, String gender, String name, LastLoginObject last_login) {
        this.id = id;
        this.email = email;
        this.gender = gender;
        this.name = name;
        this.last_login = last_login;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LastLoginObject getLast_login() {
        return last_login;
    }

    public void setLast_login(LastLoginObject last_login) {
        this.last_login = last_login;
    }
}
