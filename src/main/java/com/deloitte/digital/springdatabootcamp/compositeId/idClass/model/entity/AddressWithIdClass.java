package com.deloitte.digital.springdatabootcamp.compositeId.idClass.model.entity;

import com.deloitte.digital.springdatabootcamp.compositeId.idClass.model.AddressId;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "address")
@IdClass(AddressId.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AddressWithIdClass {
    @Id
    private String city;

    @Id
    private String street;

    @Id
    private int number;

    private String description;
}
