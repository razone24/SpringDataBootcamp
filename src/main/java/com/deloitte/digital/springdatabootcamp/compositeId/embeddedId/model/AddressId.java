package com.deloitte.digital.springdatabootcamp.compositeId.embeddedId.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddressId implements Serializable {
    private String street;
    private String city;
    private int number;
}
