package com.example.demo.service.impl;
import com.example.demo.model.Location;
import com.example.demo.repositories.LocationRepository;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationRepository locationRepository;
    @Override
    public Location createLocation(Location location) {
        if (location.getName() == null || location.getName().isEmpty()) {
            throw new IllegalArgumentException("Location name cannot be empty");
        }
        return locationRepository.save(location);
    }
    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}