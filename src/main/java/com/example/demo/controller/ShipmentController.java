package com.example.demo.controller;

import com.example.demo.model.Shipment;
import com.example.demo.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {

    @Autowired private ShipmentService shipmentService;

    @PostMapping("/{vehicleId}")
    public ResponseEntity<Shipment> createShipment(@PathVariable Long vehicleId, @RequestBody Shipment shipment) {
        try {
            Shipment savedShipment = shipmentService.createShipment(vehicleId, shipment);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedShipment);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/{shipmentId}")
    public ResponseEntity<Shipment> getShipment(@PathVariable Long shipmentId) {
        return ResponseEntity.ok(shipmentService.getShipmentById(shipmentId));
    }
}