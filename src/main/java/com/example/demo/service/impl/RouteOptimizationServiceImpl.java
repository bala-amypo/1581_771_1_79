// package com.example.demo.service.impl;
// import com.example.demo.model.RouteOptimizationResult;
// import com.example.demo.model.Shipment;
// import com.example.demo.repositories.RouteOptimizationRepository;
// import com.example.demo.repositories.ShipmentRepository;
// import com.example.demo.service.RouteOptimizationService;
// import com.example.demo.exception.ResourceNotFoundException;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// @Service
// public class RouteOptimizationServiceImpl implements RouteOptimizationService {
//     @Autowired
//     private RouteOptimizationRepository routeRepository;
//     @Autowired
//     private ShipmentRepository shipmentRepository;
//     @Override
//     public RouteOptimizationResult optimizeRoute(Long shipmentId) {
//         Shipment shipment = shipmentRepository.findById(shipmentId)
//                 .orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));
//         RouteOptimizationResult result = new RouteOptimizationResult();
//         result.setShipment(shipment);
//         result.setDistance(Math.random() * 100 + 10);
//         result.setFuelUsage(result.getDistance() * 0.15);
//         return routeRepository.save(result);
//     }
//     @Override
//     public RouteOptimizationResult getResult(Long resultId) {
//         return routeRepository.findById(resultId)
//                 .orElseThrow(() -> new ResourceNotFoundException("Result not found"));
//     }
// }