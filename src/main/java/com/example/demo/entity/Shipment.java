// package com.example.demo.entity;

// import jakarta.persistence.*;
// import lombok.*;

// import java.time.LocalDate;
// import java.util.List;

// @Entity
// @Table(name = "shipments")
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// @Builder
// public class Shipment {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @ManyToOne
//     @JoinColumn(name = "vehicle_id", nullable = false)
//     private Vehicle vehicle;

//     @ManyToOne
//     @JoinColumn(name = "pickup_location_id", nullable = false)
//     private Location pickupLocation;

//     @ManyToOne
//     @JoinColumn(name = "drop_location_id", nullable = false)
//     private Location dropLocation;

//     private Double weightKg;

//     private LocalDate scheduledDate;

//     @OneToMany(mappedBy = "shipment", cascade = CascadeType.ALL)
//     private List<RouteOptimizationResult> optimizationResults;
// }
package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "shipments")
@Data  
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    @JsonIgnore   
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "pickup_location_id", nullable = false)
    private Location pickupLocation;

    @ManyToOne
    @JoinColumn(name = "drop_location_id", nullable = false)
    private Location dropLocation;

    private Double weightKg;

    private LocalDate scheduledDate;

    @OneToMany(mappedBy = "shipment", cascade = CascadeType.ALL)
    @JsonIgnore  
    private List<RouteOptimizationResult> optimizationResults;
}
