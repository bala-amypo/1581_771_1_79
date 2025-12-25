package com.example.demo.service.impl;

import com.example.demo.entity.Shipment;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.ShipmentService;
import org.springframework.stereotype.Service;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepo;
    private final VehicleRepository vehicleRepo;

    public ShipmentServiceImpl(ShipmentRepository shipmentRepo,
                               VehicleRepository vehicleRepo) {
        this.shipmentRepo = shipmentRepo;
        this.vehicleRepo = vehicleRepo;
    }

    @Override
    public Shipment createShipment(Long vehicleId, Shipment shipment) {
        shipment.setVehicle(vehicleRepo.findById(vehicleId).orElseThrow());
        return shipmentRepo.save(shipment);
    }

    @Override
    public Shipment getShipment(Long id) {
        return shipmentRepo.findById(id).orElseThrow();
    }
}
