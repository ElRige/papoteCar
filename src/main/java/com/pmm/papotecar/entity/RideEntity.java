package com.pmm.papotecar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ride")
public class RideEntity {

    @Id
    @GeneratedValue
    private long id;
    private long driverId;
    private String state;
    private String description;
    private String seatingCapacity;
    private String price;
}
