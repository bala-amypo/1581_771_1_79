package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private String vehicleNumber;
    private double capacityKg;
    private double fuelEfficiency;

    public Vehicle() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public double getCapacityKg() { return capacityKg; }
    public void setCapacityKg(double capacityKg) { this.capacityKg = capacityKg; }

    public double getFuelEfficiency() { return fuelEfficiency; }
    public void setFuelEfficiency(double fuelEfficiency) { this.fuelEfficiency = fuelEfficiency; }
}
