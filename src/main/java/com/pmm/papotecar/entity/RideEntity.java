package com.pmm.papotecar.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
    @ManyToMany
    @JoinTable(name = "pool", joinColumns = @JoinColumn(name = "id_ride", referencedColumnName = "id_ride"), inverseJoinColumns = @JoinColumn(name = "id_user", referencedColumnName = "id_user"))
    List<UserEntity> carpoolers;
}
