package com.example.demo.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RouteOptimizationResult {

    private Long shipmentId;
    private double estimatedFuelUsage;
}
