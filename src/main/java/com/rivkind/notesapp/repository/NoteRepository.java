package com.rivkind.notesapp.repository;

import com.rivkind.notesapp.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, String> {

    // Example: find notes by user ID
    List<Note> findByUserId(String userId);
}




