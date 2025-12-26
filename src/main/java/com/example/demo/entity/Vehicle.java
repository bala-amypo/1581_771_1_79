package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleNumber;

    private Integer capacityKg;

    private Integer fuelEfficiency;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "vehicle")
    @JsonIgnore
    private List<Shipment> shipments;

    public Vehicle() {}

    public Long getId() {
        return id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Integer getCapacityKg() {
        return capacityKg;
    }

    public void setCapacityKg(Integer capacityKg) {
        this.capacityKg = capacityKg;
    }

    public Integer getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(Integer fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
