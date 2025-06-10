package com.rivkind.notesapp.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {

    @Id //this is an annotation that means that this value is the primary key
    private String user_id; //username

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 60) // bcrypt hash
    private String passwordHash;

    @Column(nullable = false)
    private LocalDate createdAt;

    public User(String user_id, String email, String passwordHash, LocalDate createdAt) {
        this.user_id = user_id;
        this.email = email;
        this.passwordHash = passwordHash;
        this.createdAt = createdAt;
    }

    public User() {

    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }
// Constructors, getters, and setters here
}
