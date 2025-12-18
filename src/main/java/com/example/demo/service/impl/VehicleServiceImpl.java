
package com.example.demo.service.impl;
import com.example.demo.model.Vehicle;
import com.example.demo.model.User;
import com.example.demo.repositories.VehicleRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.service.VehicleService;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private UserRepository userRepository;
    @Override
    public Vehicle addVehicle(Long userId, Vehicle vehicle) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        vehicle.setUser(user);
        return vehicleRepository.save(vehicle);
    }
    @Override
    public List<Vehicle> getVehiclesByUser(Long userId) {
        return vehicleRepository.findByUserId(userId);
    }
    @Override
    public Vehicle findById(Long id) {
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));
    }
}