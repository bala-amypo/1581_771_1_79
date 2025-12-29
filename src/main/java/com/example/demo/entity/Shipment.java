// package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "shipments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 🔴 THIS IS THE MAIN LOOP CAUSE
    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    @JsonIgnore   // ✅ REQUIRED
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "pickup_location_id", nullable = false)
    private Location pickupLocation;

    @ManyToOne
    @JoinColumn(name = "drop_location_id", nullable = false)
    private Location dropLocation;

    private Double weightKg;

    private LocalDate scheduledDate;

    // 🔴 SECOND LOOP CAUSE
    @OneToMany(mappedBy = "shipment", cascade = CascadeType.ALL)
    @JsonIgnore   // ✅ REQUIRED
    private List<RouteOptimizationResult> optimizationResults;
}
