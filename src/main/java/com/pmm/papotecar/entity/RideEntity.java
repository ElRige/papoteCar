package com.pmm.papotecar.entity;

import javax.persistence.Column;
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
    @Column(name = "id_ride")
    private long rideId;
    @Column(name = "id_user")
    private long driverId;
    private String state;
    private String description;
    @Column(name = "place")
    private int seatingCapacity;
    private int price;
}
