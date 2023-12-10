package com.github.daveb8772.ocpi.ocpirestservice.controller.DepotModels;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "location_info")
public class LocationInfo {

    @Id
    @Column(name = "location_id")
    private String location_id; // Unique identifier for the point of interest

    @Column(name = "location_address")
    private Address location_address;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "opening_hours")
    private String openingHours;

    @Embedded
    private ContactDetails contactInformation;

    @Embedded
    private Accessibility accessibilityInformation;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "poi_id")
    private List<PointOfInterest> pointsOfInterest;

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public Address getAddress() {
        return location_address;
    }

    public void setAddress(Address location_address) {
        this.location_address = location_address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public ContactDetails getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactDetails contactInformation) {
        this.contactInformation = contactInformation;
    }

    public Accessibility getAccessibilityInformation() {
        return accessibilityInformation;
    }

    public void setAccessibilityInformation(Accessibility accessibilityInformation) {
        this.accessibilityInformation = accessibilityInformation;
    }

    public List<PointOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }

    public void setPointsOfInterest(List<PointOfInterest> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }
}

