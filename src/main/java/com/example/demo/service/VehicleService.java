package com.example.demo.service;

import com.example.demo.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle save(Vehicle vehicle);
    Vehicle findById(Long id);
    List<Vehicle> findAll();
}
