// package com.example.demo.controller;

// import com.example.demo.model.Location;
// import com.example.demo.service.LocationService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/locations")
// public class LocationController {

//     @Autowired private LocationService locationService;

//     @PostMapping
//     public ResponseEntity<Location> createLocation(@RequestBody Location location) {
//         // Simple coordinate validation
//         if (location.getLatitude() < -90 || location.getLatitude() > 90 || 
//             location.getLongitude() < -180 || location.getLongitude() > 180) {
//             return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//         }
//         return ResponseEntity.status(HttpStatus.CREATED).body(locationService.saveLocation(location));
//     }

//     @GetMapping
//     public ResponseEntity<List<Location>> getAllLocations() {
//         return ResponseEntity.ok(locationService.findAllLocations());
//     }
// }