// package com.example.demo.entity;

// import jakarta.persistence.*;
// import lombok.*;

// import java.util.List;

// @Entity
// @Table(
//         name = "vehicles",
//         uniqueConstraints = @UniqueConstraint(columnNames = "vehicleNumber")
// )
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// @Builder
// public class Vehicle {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @ManyToOne
//     @JoinColumn(name = "user_id", nullable = false)
//     private User user;

//     @Column(nullable = false, unique = true)
//     private String vehicleNumber;

//     private Double capacityKg;

//     private Double fuelEfficiency;

//     @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
//     private List<Shipment> shipments;
// }
 


