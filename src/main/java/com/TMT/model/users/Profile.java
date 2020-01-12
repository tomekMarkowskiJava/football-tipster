package com.TMT.model.users;

import com.TMT.model.matches.Fixture;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import java.util.Set;

@Entity(name = "profile")
public class Profile {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String password;

    private String email;
    private String status;

    private Long points;

    public Profile() {
    }

    public Profile(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
//    private Set<Fixture> placedBets;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }
}
