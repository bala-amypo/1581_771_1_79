package com.example.demo.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ShipmentRequest {

    private Long pickupLocationId;
    private Long dropLocationId;
    private Double weightKg;
    private LocalDate scheduledDate;
}
