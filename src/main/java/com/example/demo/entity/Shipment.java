package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double weightKg;

    private LocalDate scheduledDate;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    @JsonIgnore
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "pickup_location_id")
    private Location pickupLocation;

    @ManyToOne
    @JoinColumn(name = "drop_location_id")
    private Location dropLocation;

    @OneToMany(mappedBy = "shipment")
    @JsonIgnore
    private List<RouteOptimizationResult> optimizationResults;

    // ====== CONSTRUCTORS ======
    public Shipment() {
    }

    // ====== GETTERS & SETTERS ======

    public Long getId() {
        return id;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    public Vehicle getVehicle() {          // ✅ MUST BE INSIDE CLASS
        return vehicle;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    public void setScheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }
}
