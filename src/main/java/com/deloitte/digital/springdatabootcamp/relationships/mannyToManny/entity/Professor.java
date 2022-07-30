package com.deloitte.digital.springdatabootcamp.relationships.mannyToManny.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(name = "professor_student",
//            joinColumns = @JoinColumn(name = "professor"),
//            inverseJoinColumns = @JoinColumn(name = "student")
//    )
    private List<Student> students;
}
