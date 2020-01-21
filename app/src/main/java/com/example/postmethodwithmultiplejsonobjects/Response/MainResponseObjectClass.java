package com.example.postmethodwithmultiplejsonobjects.Response;

import com.example.postmethodwithmultiplejsonobjects.LastLoginObject;

public class MainResponseObjectClass {

    private String name;
    private String email;
    private String gender;
    private String id;
    private LastLoginObject last_login;

    public MainResponseObjectClass() {
    }

    public MainResponseObjectClass(String name, String email, String gender, String id, LastLoginObject last_login) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.id = id;
        this.last_login = last_login;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LastLoginObject getLast_login() {
        return last_login;
    }

    public void setLast_login(LastLoginObject last_login) {
        this.last_login = last_login;
    }

}
