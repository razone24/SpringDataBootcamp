package com.deloitte.digital.springdatabootcamp.temporal.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String details;

//    @Temporal(value = TemporalType.DATE)
//    @Temporal(value = TemporalType.TIME)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date date;
}
