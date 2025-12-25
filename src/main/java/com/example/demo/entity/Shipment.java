package com.example.demo.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shipment {

    private Long id;
    private double weightKg;
    private Location pickupLocation;
    private Location dropLocation;
    private Vehicle vehicle;
}
