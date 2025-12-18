package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.service.RouteOptimizationService;

@RestController
@RequestMapping("/optimize")
public class RouteOptimizationController {

    private final RouteOptimizationService routeService;

    public RouteOptimizationController(RouteOptimizationService routeService) {
        this.routeService = routeService;
    }

    @PostMapping("/{shipmentId}")
    public RouteOptimizationResult optimizeRoute(@PathVariable Long shipmentId) {
        return routeService.optimizeRoute(shipmentId);
    }
}
