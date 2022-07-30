package com.deloitte.digital.springdatabootcamp.enumerated.model.entity;

import com.deloitte.digital.springdatabootcamp.enumerated.model.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

//    @Enumerated(EnumType.ORDINAL) -> default value
    @Enumerated(EnumType.STRING)
    private VehicleType type;
}
