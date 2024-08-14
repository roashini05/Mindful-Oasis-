package com.example.mindful_oasis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mindful_oasis.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByEmail(String email);

}
