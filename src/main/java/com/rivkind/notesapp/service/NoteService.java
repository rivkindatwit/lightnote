package com.rivkind.notesapp.service;

import com.rivkind.notesapp.model.Note;
import com.rivkind.notesapp.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note createNote(Note note) {
        // Add validation logic here if needed
        return noteRepository.save(note);
    }

    public Optional<Note> getNoteById(String noteId) {
        return noteRepository.findById(noteId);
    }

    public List<Note> getNotesByUserId(String userId) {
        return noteRepository.findByUserId(userId);
    }

    // Add more methods as needed
} 