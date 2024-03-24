package com.ksbhat.learnjpaandhibernate.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name="user_details")
public class User {

    protected User() {

    }
    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Post> posts;
    @Size(message = "Names should be min 2")
    private String name;
    @Past(message = "Date should be past")
    private LocalDateTime birthDate;

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

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public List<Post> getPosts() { return posts;}
    public void setPosts(List<Post> posts) {this.posts=posts;}

    public User(Integer id, String name, LocalDateTime birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
