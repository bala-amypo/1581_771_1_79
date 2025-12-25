package com.example.demo.repository;

import com.example.demo.entity.Vehicle;

import java.util.List;

public interface VehicleRepository extends <Vehicle, Long> {
    List<Vehicle> findByUserId(Long userId);
}
