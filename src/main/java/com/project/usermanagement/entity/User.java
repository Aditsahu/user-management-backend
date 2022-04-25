package com.project.usermanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    private String dob;
    private String contact;

    public User() {
    }

    public User(Integer id, String name, String username, String email, String dob, String contact) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.dob = dob;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
