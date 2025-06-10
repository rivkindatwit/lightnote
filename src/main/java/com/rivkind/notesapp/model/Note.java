package com.rivkind.notesapp.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "notes")
public class Note {

    @Id // primary key
    private String note_id;

    @Column(nullable = false, unique = true,length = 30)
    private String user_id;

    @Column(nullable = false, length = 100)
    private String title;

    public Note() {

    }

    public void setNote_id(String note_id) {
        this.note_id = note_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getNote_id() {
        return note_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public Note(String note_id, String user_id, String title, String content, LocalDate createdAt) {
        this.note_id = note_id;
        this.user_id = user_id;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
    }

    @Column(nullable = true)
    private String content;

    @Column(nullable = false)
    private LocalDate createdAt;


}