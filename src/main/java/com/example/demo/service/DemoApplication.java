// package com.example.demo.service.impl;

// import com.example.demo.model.*;
// import com.example.demo.repository.*;
// import com.example.demo.exception.ResourceNotFoundException;
// import org.springframework.stereotype.Service;
// import java.time.LocalDateTime;

// @Service
// public class RouteOptimizationServiceImpl {
//     private final RouteOptimizationResultRepository resultRepository;
//     private final ShipmentRepository shipmentRepository;

//     public RouteOptimizationServiceImpl(RouteOptimizationResultRepository resultRepository, ShipmentRepository shipmentRepository) {
//         this.resultRepository = resultRepository;
//         this.shipmentRepository = shipmentRepository;
//     }

//     public RouteOptimizationResult generateOptimization(Long shipmentId) {
//         Shipment shipment = shipmentRepository.findById(shipmentId)
//             .orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));

//         Location p = shipment.getPickupLocation();
//         Location d = shipment.getDropLocation();

//         // SRS Formula: distance = Math.hypot(lat2-lat1, lon2-lon1) * 111
//         double distance = Math.hypot(d.getLatitude() - p.getLatitude(), 
//                                      d.getLongitude() - p.getLongitude()) * 111;

//         // SRS Formula: fuelUsage = distance / vehicle.fuelEfficiency
//         double fuelUsage = distance / shipment.getVehicle().getFuelEfficiency();

//         RouteOptimizationResult result = RouteOptimizationResult.builder()
//                 .shipment(shipment)
//                 .optimizedDistanceKm(distance)
//                 .estimatedFuelUsageL(fuelUsage)
//                 .generatedAt(LocalDateTime.now())
//                 .build();

//         return resultRepository.save(result);
//     }
// }