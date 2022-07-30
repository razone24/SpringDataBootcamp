package com.deloitte.digital.springdatabootcamp.relationships.mannyToManny.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "students", cascade = CascadeType.ALL)
    private List<Professor> professors;
}
