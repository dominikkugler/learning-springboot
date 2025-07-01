package com.learning_springboot.learning_springboot.repository;

import com.learning_springboot.learning_springboot.entity.MyUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<MyUsers, Integer> {
    Optional<MyUsers> findByEmail(String email);
}
