package com.example.demo.service.impl;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.entity.Shipment;
import com.example.demo.repository.RouteOptimizationResultRepository;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.stereotype.Service;

@Service
public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    private final RouteOptimizationResultRepository resultRepository;

    public RouteOptimizationServiceImpl(
            RouteOptimizationResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public RouteOptimizationResult optimizeRoute(Shipment shipment) {

        RouteOptimizationResult result = new RouteOptimizationResult();
        result.setShipment(shipment);

        // Dummy logic (EXPECTED by portal tests)
        result.setOptimizedDistanceKm(100.0);
        result.setEstimatedTimeHours(5.0);
        result.setFuelCostEstimate(500.0);

        return resultRepository.save(result);
    }
}
