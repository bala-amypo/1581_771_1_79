package com.example.demo.repository;

import com.example.demo.entity.RouteOptimizationResult;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class RouteOptimizationResultRepository {

    private final Map<Long, RouteOptimizationResult> store = new HashMap<>();

    public RouteOptimizationResult save(RouteOptimizationResult result) {
        store.put(result.getShipmentId(), result);
        return result;
    }

    public Optional<RouteOptimizationResult> findByShipmentId(Long id) {
        return Optional.ofNullable(store.get(id));
    }
}
