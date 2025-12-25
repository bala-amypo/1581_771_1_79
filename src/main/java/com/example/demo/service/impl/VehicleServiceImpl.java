package com.example.demo.service.impl;

import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.VehicleService;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) { // EXACT
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
