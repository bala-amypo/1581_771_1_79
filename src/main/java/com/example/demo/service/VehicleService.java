package com.example.demo.service;

import com.example.demo.entity.Vehicle;
import com.example.demo.exception.ResourceNotFoundException;

import java.util.List;

public interface VehicleService {

    Vehicle addVehicle(Long userId, Vehicle vehicle);

    List<Vehicle> getVehiclesByUser(Long userId);

    Vehicle findById(Long vehicleId) throws ResourceNotFoundException;
}
