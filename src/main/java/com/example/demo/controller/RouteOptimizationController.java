package com.example.demo.controller;

import com.example.demo.model.RouteOptimizationResult;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/optimize")
public class RouteOptimizationController {

    @Autowired private RouteOptimizationService routeService;

    @PostMapping("/{shipmentId}")
    public ResponseEntity<RouteOptimizationResult> optimizeRoute(@PathVariable Long shipmentId) {
        RouteOptimizationResult result = routeService.generateOptimization(shipmentId);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping("/result/{resultId}")
    public ResponseEntity<RouteOptimizationResult> getResult(@PathVariable Long resultId) {
        return ResponseEntity.ok(routeService.getResultById(resultId));
    }
}