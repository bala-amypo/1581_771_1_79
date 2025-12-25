package com.example.demo.service.impl;

import com.example.demo.entity.Shipment;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.service.ShipmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository repository;

    public ShipmentServiceImpl(ShipmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Shipment save(Shipment shipment) {
        return repository.save(shipment);
    }

    @Override
    public Shipment findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Shipment> findByVehicleId(Long vehicleId) {
        return repository.findByVehicleId(vehicleId);
    }
}
