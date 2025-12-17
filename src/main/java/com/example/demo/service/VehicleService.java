package com.example.demo.service;
import com.example.demo.model.Vehicle;
import java.util.List;
public interface VehicleService {
    Vehicle addVehicle(Long userId, Vehicle vehicle);
    List<Vehicle> getVehiclesByUser(Long userId);
    Vehicle findById(Long id);
}