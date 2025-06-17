package com.rivkind.notesapp.repository;

import com.rivkind.notesapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    // You can add custom query methods later if needed
    User findByEmail(String email);
}




