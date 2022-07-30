package com.deloitte.digital.springdatabootcamp.compositeId.idClass.model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AddressId implements Serializable {
    private String city;
    private String street;
    private int number;
}
