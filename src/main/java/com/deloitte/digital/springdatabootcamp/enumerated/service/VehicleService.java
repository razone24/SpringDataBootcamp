package com.deloitte.digital.springdatabootcamp.enumerated.service;

import com.deloitte.digital.springdatabootcamp.enumerated.model.entity.Vehicle;
import com.deloitte.digital.springdatabootcamp.enumerated.model.enums.VehicleType;
import com.deloitte.digital.springdatabootcamp.enumerated.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public void create() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        vehicle.setType(VehicleType.CAR);

        vehicleRepository.save(vehicle);
    }
}
