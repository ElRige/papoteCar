package com.pmm.papotecar.entity;

import java.util.Date;

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
    private int stepId;
    private int rideId;
    private String city;
    private Date stepDate;
}
