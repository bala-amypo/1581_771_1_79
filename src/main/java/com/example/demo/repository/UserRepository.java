package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {

    private final Map<Long, User> store = new HashMap<>();
    private long id = 1;

    public User save(User user) {
        user.setId(id++);
        store.put(user.getId(), user);
        return user;
    }

    public Optional<User> findByEmail(String email) {
        return store.values().stream()
                .filter(u -> email.equals(u.getEmail()))
                .findFirst();
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }
}
