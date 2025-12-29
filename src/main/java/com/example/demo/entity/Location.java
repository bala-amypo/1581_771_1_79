// package com.example.demo.entity;

// import jakarta.persistence.*;
// import lombok.*;

// import java.util.List;

// @Entity
// @Table(name = "locations")
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// @Builder
// public class Location {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String name;

//     private Double latitude;

//     private Double longitude;

//     @OneToMany(mappedBy = "pickupLocation")
//     private List<Shipment> pickupShipments;

//     @OneToMany(mappedBy = "dropLocation")
//     private List<Shipment> dropShipments;
// }


package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "locations")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double latitude;

    private Double longitude;

    @OneToMany(mappedBy = "pickupLocation")
    @JsonIgnore
    private List<Shipment> pickupShipments;

    @OneToMany(mappedBy = "dropLocation")
    @JsonIgnore
    private List<Shipment> dropShipments;
}
