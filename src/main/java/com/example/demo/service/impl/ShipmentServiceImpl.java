package com.example.demo.service.impl;

import com.example.demo.dto.ShipmentRequest;
import com.example.demo.entity.Location;
import com.example.demo.entity.Shipment;
import com.example.demo.entity.Vehicle;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.LocationRepository;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.ShipmentService;
import org.springframework.stereotype.Service;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;
    private final VehicleRepository vehicleRepository;
    private final LocationRepository locationRepository;

    public ShipmentServiceImpl(
            ShipmentRepository shipmentRepository,
            VehicleRepository vehicleRepository,
            LocationRepository locationRepository) {

        this.shipmentRepository = shipmentRepository;
        this.vehicleRepository = vehicleRepository;
        this.locationRepository = locationRepository;
    }

    @Override
    public Shipment createShipment(Long vehicleId, ShipmentRequest request) {

        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));

        Location pickup = locationRepository.findById(request.getPickupLocationId())
                .orElseThrow(() -> new ResourceNotFoundException("Pickup location not found"));

        Location drop = locationRepository.findById(request.getDropLocationId())
                .orElseThrow(() -> new ResourceNotFoundException("Drop location not found"));

        Shipment shipment = new Shipment();
        shipment.setVehicle(vehicle);
        shipment.setPickupLocation(pickup);
        shipment.setDropLocation(drop);
        shipment.setWeightKg(request.getWeightKg());
        shipment.setScheduledDate(request.getScheduledDate());

        return shipmentRepository.save(shipment);
    }
}
