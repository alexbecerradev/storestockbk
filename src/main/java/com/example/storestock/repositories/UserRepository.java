package com.example.storestock.repositories;


import com.example.storestock.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email); // Actualiza la declaración del método
}
