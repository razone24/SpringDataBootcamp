package com.deloitte.digital.springdatabootcamp.embedded.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class Location {
    private String city;
    private String street;
    private int number;
}
