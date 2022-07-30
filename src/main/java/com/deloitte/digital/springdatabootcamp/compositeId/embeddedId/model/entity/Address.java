package com.deloitte.digital.springdatabootcamp.compositeId.embeddedId.model.entity;

import com.deloitte.digital.springdatabootcamp.compositeId.embeddedId.model.AddressId;
import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {

    @EmbeddedId
    private AddressId addressId;

    private String description;
}
