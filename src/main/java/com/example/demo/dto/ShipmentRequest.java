package com.example.demo.dto;

import java.time.LocalDate;

public class ShipmentRequest {

    private Long pickupLocationId;
    private Long dropLocationId;
    private Double weightKg;
    private LocalDate scheduledDate;

    public Long getPickupLocationId() {
        return pickupLocationId;
    }

    public void setPickupLocationId(Long pickupLocationId) {
        this.pickupLocationId = pickupLocationId;
    }

    public Long getDropLocationId() {
        return dropLocationId;
    }

    public void setDropLocationId(Long dropLocationId) {
        this.dropLocationId = dropLocationId;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }
}
