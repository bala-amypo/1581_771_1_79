package com.example.demo.repository;

import com.example.demo.entity.Shipment;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ShipmentRepository {

    private final Map<Long, Shipment> store = new HashMap<>();
    private long id = 1;

    public Shipment save(Shipment shipment) {
        shipment.setId(id++);
        store.put(shipment.getId(), shipment);
        return shipment;
    }

    public Optional<Shipment> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }
}
