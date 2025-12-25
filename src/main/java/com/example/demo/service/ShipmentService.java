package com.example.demo.service;

import com.example.demo.entity.Shipment;

import java.util.List;

public interface ShipmentService {
    Shipment save(Shipment shipment);
    Shipment findById(Long id);
    List<Shipment> findByVehicleId(Long vehicleId);
}
