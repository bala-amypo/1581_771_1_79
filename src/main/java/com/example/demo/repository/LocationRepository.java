package com.example.demo.repository;

import com.example.demo.entity.Location;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class LocationRepository {

    private final Map<Long, Location> store = new HashMap<>();
    private long id = 1;

    public Location save(Location location) {
        location.setId(id++);
        store.put(location.getId(), location);
        return location;
    }

    public List<Location> findAll() {
        return new ArrayList<>(store.values());
    }
}
