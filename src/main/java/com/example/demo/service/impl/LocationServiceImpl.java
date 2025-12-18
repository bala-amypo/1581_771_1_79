package com.example.demo.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRepository;
import com.example.demo.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository repo;

    public LocationServiceImpl(LocationRepository repo) {
        this.repo = repo;
    }

    @Override
    public Location createLocation(Location location) {
        if (location.getLatitude() > 90 || location.getLatitude() < -90) {
            throw new IllegalArgumentException("Invalid latitude value");
        }
        return repo.save(location);
    }

    @Override
    public List<Location> getAllLocations() {
        return repo.findAll();
    }
}
