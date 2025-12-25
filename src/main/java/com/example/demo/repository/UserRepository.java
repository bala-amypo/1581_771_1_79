package com.example.demo.repository;

import com.example.demo.entity.User;

import java.util.Optional;

public interface UserRepository extends <User, Long> {
    Optional<User> findByEmail(String email);
}
