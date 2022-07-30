package com.deloitte.digital.springdatabootcamp.relationships.oneToOne.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(mappedBy = "person", fetch = FetchType.EAGER)
    private Passport passport;
}
