package com.pmm.papotecar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    @GeneratedValue
    private int id;
    private int userId;
    private String seatingCapacity;
    private String color;
    private String model;
    private String urlPicture;
}
