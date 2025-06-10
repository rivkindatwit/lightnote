package com.rivkind.notesapp.repository;

import com.rivkind.notesapp.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
    // Example: find notes by user ID
}
