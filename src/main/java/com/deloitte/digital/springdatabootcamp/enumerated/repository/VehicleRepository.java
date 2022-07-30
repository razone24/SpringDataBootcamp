package com.deloitte.digital.springdatabootcamp.enumerated.repository;

import com.deloitte.digital.springdatabootcamp.enumerated.model.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
