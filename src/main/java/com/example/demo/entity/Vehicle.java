package com.example.demo.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {

    private Long id;
    private String vehicleNumber;
    private double capacityKg;
    private User user;
}
