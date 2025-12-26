package com.example.demo.service;

import com.example.demo.dto.ShipmentRequest;
import com.example.demo.entity.Shipment;

public interface ShipmentService {

    Shipment createShipment(Long vehicleId, ShipmentRequest request);
}
