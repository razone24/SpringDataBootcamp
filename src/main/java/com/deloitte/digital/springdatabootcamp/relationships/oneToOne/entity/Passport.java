package com.deloitte.digital.springdatabootcamp.relationships.oneToOne.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private int number;

    private String description;

    @JoinColumn(name = "person")
    @OneToOne(cascade = CascadeType.PERSIST)
    private Person person;
}
