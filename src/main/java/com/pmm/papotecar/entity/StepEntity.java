package com.pmm.papotecar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "step")
public class StepEntity {

    @Id
    @GeneratedValue
    private int id;
    private int rideId;
    private String city;
    private String stepDate;
}
