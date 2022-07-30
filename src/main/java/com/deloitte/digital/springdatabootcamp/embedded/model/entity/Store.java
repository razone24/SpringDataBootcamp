package com.deloitte.digital.springdatabootcamp.embedded.model.entity;

import com.deloitte.digital.springdatabootcamp.embedded.model.Location;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Embedded
    private Location location;
}
