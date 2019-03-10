package com.example.mbsv3.Structure;

public class User {
    private Integer id;
    private String Username;
    private String Password;
    private String email;
    private String FullName;

    public User(Integer id, String username, String password, String email, String fullName) {
        this.id = id;
        Username = username;
        Password = password;
        this.email = email;
        FullName = fullName;
    }

    public User(String username, String password, String email, String fullName) {
        Username = username;
        Password = password;
        this.email = email;
        FullName = fullName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }
}
