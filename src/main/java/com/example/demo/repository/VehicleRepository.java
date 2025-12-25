package com.example.demo.repository;

import com.example.demo.entity.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class VehicleRepository {

    private final Map<Long, Vehicle> store = new HashMap<>();
    private long id = 1;

    public Vehicle save(Vehicle vehicle) {
        vehicle.setId(id++);
        store.put(vehicle.getId(), vehicle);
        return vehicle;
    }

    public Optional<Vehicle> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    public List<Vehicle> findByUserId(Long userId) {
        List<Vehicle> list = new ArrayList<>();
        for (Vehicle v : store.values()) {
            if (v.getUser() != null && v.getUser().getId().equals(userId)) {
                list.add(v);
            }
        }
        return list;
    }
}
