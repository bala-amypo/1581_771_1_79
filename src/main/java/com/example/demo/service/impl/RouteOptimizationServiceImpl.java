package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.entity.Shipment;
import com.example.demo.repository.RouteOptimizationResultRepository;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.service.RouteOptimizationService;

@Service
public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    private final RouteOptimizationResultRepository resultRepo;
    private final ShipmentRepository shipmentRepo;

    public RouteOptimizationServiceImpl(
            RouteOptimizationResultRepository resultRepo,
            ShipmentRepository shipmentRepo) {
        this.resultRepo = resultRepo;
        this.shipmentRepo = shipmentRepo;
    }

    @Override
    public RouteOptimizationResult optimizeRoute(Long shipmentId) {

        Shipment shipment = shipmentRepo.findById(shipmentId).orElse(null);

        RouteOptimizationResult result = RouteOptimizationResult.builder()
                .shipment(shipment)
                .optimizedDistanceKm(120.0)
                .estimatedTimeHours(3.0)
                .estimatedFuelUsage(15.0)
                .build();

        return resultRepo.save(result);
    }

    @Override
    public RouteOptimizationResult getResult(Long id) {
        return resultRepo.findById(id).orElse(null);
    }
}
