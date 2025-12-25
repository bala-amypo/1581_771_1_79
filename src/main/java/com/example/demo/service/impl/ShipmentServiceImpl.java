package com.example.demo.service.impl;

import com.example.demo.entity.Shipment;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.repository.LocationRepository;
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
            LocationRepository locationRepository
    ) {
        this.shipmentRepository = shipmentRepository;
        this.vehicleRepository = vehicleRepository;
        this.locationRepository = locationRepository;
    }

    @Override
    public Shipment save(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }
}
