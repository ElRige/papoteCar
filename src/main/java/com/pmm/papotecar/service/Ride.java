package com.pmm.papotecar.service;

import java.util.List;

import lombok.Data;

@Data
public class Ride {

    private long id;
    private String state;
    private String description;
    private String seatingCapacity;
    private String price;
    private User driver;
    private List<User> pools;

    public Ride(long id, String state, String description, String seatingCapacity, String price, User driver,
	    List<User> pools) {
	this.id = id;
	this.state = state;
	this.description = description;
	this.seatingCapacity = seatingCapacity;
	this.price = price;
	this.driver = driver;
	this.pools = pools;
    }

}
