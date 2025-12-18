// package com.example.demo.service.impl;
// import com.example.demo.model.Shipment;
// import com.example.demo.model.Vehicle;
// import com.example.demo.repositories.ShipmentRepository;
// import com.example.demo.repositories.VehicleRepository;
// import com.example.demo.service.ShipmentService;
// import com.example.demo.exception.ResourceNotFoundException;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// @Service
// public class ShipmentServiceImpl implements ShipmentService {
//     @Autowired
//     private ShipmentRepository shipmentRepository;
//     @Autowired
//     private VehicleRepository vehicleRepository;
//     @Override
//     public Shipment createShipment(Long vehicleId, Shipment shipment) {
//         Vehicle vehicle = vehicleRepository.findById(vehicleId)
//                 .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));
//         if (shipment.getWeight() > vehicle.getCapacity()) {
//             throw new IllegalArgumentException("Shipment weight exceeds vehicle capacity");
//         }
//         shipment.setVehicle(vehicle);
//         return shipmentRepository.save(shipment);
//     }
//     @Override
//     public Shipment getShipment(Long shipmentId) {
//         return shipmentRepository.findById(shipmentId)
//                 .orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));
//     }
// }