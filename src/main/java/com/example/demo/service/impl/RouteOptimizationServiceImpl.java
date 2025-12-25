package com.example.demo.service.impl;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.entity.Shipment;
import com.example.demo.repository.RouteOptimizationResultRepository;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.stereotype.Service;

@Service
public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    private final ShipmentRepository shipmentRepo;
    private final RouteOptimizationResultRepository resultRepo;

    public RouteOptimizationServiceImpl(ShipmentRepository shipmentRepo,
                                        RouteOptimizationResultRepository resultRepo) {
        this.shipmentRepo = shipmentRepo;
        this.resultRepo = resultRepo;
    }

    @Override
    public RouteOptimizationResult optimizeRoute(Long shipmentId) {
        Shipment shipment = shipmentRepo.findById(shipmentId).orElseThrow();

        RouteOptimizationResult result = RouteOptimizationResult.builder()
                .shipment(shipment)
                .optimizedDistanceKm(100)
                .estimatedTimeHours(2)
                .estimatedFuelUsage(10)
                .build();

        return resultRepo.save(result);
    }
}
