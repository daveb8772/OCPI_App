package com.github.daveb8772.ocpi.ocpirestservice.repository;


import com.github.daveb8772.ocpi.ocpirestservice.controller.DepotModels.LocationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationInfoRepository extends JpaRepository<LocationInfo, String> {
    // Custom query methods can be defined here if needed
}