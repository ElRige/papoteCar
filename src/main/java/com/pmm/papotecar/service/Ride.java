package com.pmm.papotecar.service;

import java.util.List;

import lombok.Data;

@Data
public class Ride {

    private long id;
    private String state;
    private String description;
    private int seatingCapacity;
    private int price;
    private User driver;
    private List<User> carpoolers;

    public Ride(long id, String state, String description, int seatingCapacity, int price, User driver,
	    List<User> carpoolers) {
	this.id = id;
	this.state = state;
	this.description = description;
	this.seatingCapacity = seatingCapacity;
	this.price = price;
	this.driver = driver;
	this.carpoolers = carpoolers;
    }

}
