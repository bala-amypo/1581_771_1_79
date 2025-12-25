package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class RouteOptimizationResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Shipment shipment;

    private double optimizedDistanceKm;
    private double estimatedTimeHours;
    private double fuelCostEstimate;

    public RouteOptimizationResult() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Shipment getShipment() { return shipment; }
    public void setShipment(Shipment shipment) { this.shipment = shipment; }

    public double getOptimizedDistanceKm() { return optimizedDistanceKm; }
    public void setOptimizedDistanceKm(double optimizedDistanceKm) {
        this.optimizedDistanceKm = optimizedDistanceKm;
    }

    public double getEstimatedTimeHours() { return estimatedTimeHours; }
    public void setEstimatedTimeHours(double estimatedTimeHours) {
        this.estimatedTimeHours = estimatedTimeHours;
    }

    public double getFuelCostEstimate() { return fuelCostEstimate; }
    public void setFuelCostEstimate(double fuelCostEstimate) {
        this.fuelCostEstimate = fuelCostEstimate;
    }
}
